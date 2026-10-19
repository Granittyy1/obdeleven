package com.voltasit.obdeleven.core;

import android.content.Context;
import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes3.dex */
public enum BodyType {
    UNKNOWN(0, 0, R.string.common_unknown),
    /* JADX INFO: Fake field, exist only in values array */
    SALOON(1, 4, R.string.common_body_type_saloon),
    /* JADX INFO: Fake field, exist only in values array */
    COUPE(2, 2, R.string.common_body_type_coupe),
    /* JADX INFO: Fake field, exist only in values array */
    HATCHBACK(3, 1, R.string.common_body_type_hatchback),
    /* JADX INFO: Fake field, exist only in values array */
    D3_HATCHBACK(4, 18, R.string.common_body_type_3d_hatchback),
    /* JADX INFO: Fake field, exist only in values array */
    SPORTS_COUPE(5, 20, R.string.common_body_type_sports_coupe),
    /* JADX INFO: Fake field, exist only in values array */
    D5_HATCHBACK(6, 19, R.string.common_body_type_5d_hatchback),
    /* JADX INFO: Fake field, exist only in values array */
    SPORTBACK(7, 3, R.string.body_type_sportback),
    /* JADX INFO: Fake field, exist only in values array */
    AVANT(8, 5, R.string.common_body_type_avant),
    /* JADX INFO: Fake field, exist only in values array */
    VARIANT(9, 15, R.string.common_body_type_variant),
    /* JADX INFO: Fake field, exist only in values array */
    ESTATE(10, 13, R.string.common_body_type_estate),
    /* JADX INFO: Fake field, exist only in values array */
    SPORTS_TOURER(11, 21, R.string.common_body_type_sports_tourer),
    /* JADX INFO: Fake field, exist only in values array */
    SPACEBACK(12, 22, R.string.common_body_type_spaceback),
    /* JADX INFO: Fake field, exist only in values array */
    ROADSTER(13, 8, R.string.common_body_type_roadster),
    /* JADX INFO: Fake field, exist only in values array */
    CABRIOLET(14, 7, R.string.common_body_type_cabriolet),
    /* JADX INFO: Fake field, exist only in values array */
    COUPE_CONVERTIBLE(15, 17, R.string.common_body_type_coupe_convertible),
    /* JADX INFO: Fake field, exist only in values array */
    SPYDER(16, 9, R.string.common_body_type_spyder),
    /* JADX INFO: Fake field, exist only in values array */
    LONG(17, 10, R.string.common_body_type_long_body),
    /* JADX INFO: Fake field, exist only in values array */
    SUV(18, 11, R.string.common_body_type_suv),
    /* JADX INFO: Fake field, exist only in values array */
    MPV(19, 12, R.string.common_body_type_mpv),
    /* JADX INFO: Fake field, exist only in values array */
    PICKUP(20, 14, R.string.common_body_type_pickup),
    /* JADX INFO: Fake field, exist only in values array */
    VAN(21, 16, R.string.common_body_type_van);

    private final int id;
    private final int order;
    private final int textResource;

    BodyType(int i10, int i11, int i12) {
        this.order = i10;
        this.id = i11;
        this.textResource = i12;
    }

    public static BodyType a(int i10) {
        for (BodyType bodyType : values()) {
            if (bodyType.id == i10) {
                return bodyType;
            }
        }
        return UNKNOWN;
    }

    public final int b() {
        return this.order;
    }

    public final String c(Context context) {
        return context.getString(this.textResource);
    }
}
