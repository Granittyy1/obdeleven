package com.voltasit.obdeleven.models;

import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes3.dex */
public enum SupportedManufacturer {
    /* JADX INFO: Fake field, exist only in values array */
    AUDI("Audi", 0, R.drawable.audi),
    /* JADX INFO: Fake field, exist only in values array */
    VOLKSWAGEN("Volkswagen", 1, R.drawable.vw),
    /* JADX INFO: Fake field, exist only in values array */
    SEAT("Seat", 2, R.drawable.seat),
    /* JADX INFO: Fake field, exist only in values array */
    SKODA("Skoda", 3, R.drawable.skoda),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBORGHINI("Lamborghini", 4, R.drawable.lambo),
    /* JADX INFO: Fake field, exist only in values array */
    BENTLEY("Bentley", 5, R.drawable.bentley);

    private final String dbName;
    private final int imageResource;
    private final String name;

    SupportedManufacturer(String str, int i10, int i11) {
        this.name = str;
        this.imageResource = i11;
        this.dbName = str;
    }

    public final String a() {
        return this.dbName;
    }

    public final int b() {
        return this.imageResource;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.name;
    }
}
