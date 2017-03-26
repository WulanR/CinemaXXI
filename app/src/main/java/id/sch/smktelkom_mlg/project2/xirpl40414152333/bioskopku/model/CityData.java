package id.sch.smktelkom_mlg.project2.xirpl40414152333.bioskopku.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Andra Maret on 20/03/2017.
 */
public class CityData implements Parcelable {
    public static final Parcelable.Creator<CityData> CREATOR = new Parcelable.Creator<CityData>() {
        @Override
        public CityData createFromParcel(Parcel source) {
            return new CityData(source);
        }

        @Override
        public CityData[] newArray(int size) {
            return new CityData[size];
        }
    };
    private String id;
    private String kota;

    public CityData() {
    }

    protected CityData(Parcel in) {
        this.id = in.readString();
        this.kota = in.readString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.kota);
    }
}
