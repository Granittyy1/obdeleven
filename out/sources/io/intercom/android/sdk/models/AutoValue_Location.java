package io.intercom.android.sdk.models;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Location extends Location {
    private final String cityName;
    private final String countryName;
    private final Integer timezoneOffset;

    public AutoValue_Location(String str, String str2, Integer num) {
        if (str == null) {
            throw new NullPointerException("Null cityName");
        }
        this.cityName = str;
        if (str2 == null) {
            throw new NullPointerException("Null countryName");
        }
        this.countryName = str2;
        this.timezoneOffset = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        if (this.cityName.equals(location.getCityName()) && this.countryName.equals(location.getCountryName())) {
            Integer num = this.timezoneOffset;
            if (num == null) {
                if (location.getTimezoneOffset() == null) {
                    return true;
                }
            } else if (num.equals(location.getTimezoneOffset())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Location
    public String getCityName() {
        return this.cityName;
    }

    @Override // io.intercom.android.sdk.models.Location
    public String getCountryName() {
        return this.countryName;
    }

    @Override // io.intercom.android.sdk.models.Location
    public Integer getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public int hashCode() {
        int iHashCode = (((this.cityName.hashCode() ^ 1000003) * 1000003) ^ this.countryName.hashCode()) * 1000003;
        Integer num = this.timezoneOffset;
        return iHashCode ^ (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "Location{cityName=" + this.cityName + ", countryName=" + this.countryName + ", timezoneOffset=" + this.timezoneOffset + "}";
    }
}
