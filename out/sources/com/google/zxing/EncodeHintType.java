package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class EncodeHintType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EncodeHintType f29209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EncodeHintType f29210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EncodeHintType f29211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EncodeHintType f29212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EncodeHintType f29213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EncodeHintType[] f29214g;

    static {
        EncodeHintType encodeHintType = new EncodeHintType("ERROR_CORRECTION", 0);
        f29209b = encodeHintType;
        EncodeHintType encodeHintType2 = new EncodeHintType("CHARACTER_SET", 1);
        f29210c = encodeHintType2;
        EncodeHintType encodeHintType3 = new EncodeHintType("DATA_MATRIX_SHAPE", 2);
        EncodeHintType encodeHintType4 = new EncodeHintType("MIN_SIZE", 3);
        EncodeHintType encodeHintType5 = new EncodeHintType("MAX_SIZE", 4);
        EncodeHintType encodeHintType6 = new EncodeHintType("MARGIN", 5);
        f29211d = encodeHintType6;
        EncodeHintType encodeHintType7 = new EncodeHintType("PDF417_COMPACT", 6);
        EncodeHintType encodeHintType8 = new EncodeHintType("PDF417_COMPACTION", 7);
        EncodeHintType encodeHintType9 = new EncodeHintType("PDF417_DIMENSIONS", 8);
        EncodeHintType encodeHintType10 = new EncodeHintType("AZTEC_LAYERS", 9);
        EncodeHintType encodeHintType11 = new EncodeHintType("QR_VERSION", 10);
        f29212e = encodeHintType11;
        EncodeHintType encodeHintType12 = new EncodeHintType("GS1_FORMAT", 11);
        f29213f = encodeHintType12;
        f29214g = new EncodeHintType[]{encodeHintType, encodeHintType2, encodeHintType3, encodeHintType4, encodeHintType5, encodeHintType6, encodeHintType7, encodeHintType8, encodeHintType9, encodeHintType10, encodeHintType11, encodeHintType12};
    }

    public EncodeHintType() {
        throw null;
    }

    public static EncodeHintType valueOf(String str) {
        return (EncodeHintType) Enum.valueOf(EncodeHintType.class, str);
    }

    public static EncodeHintType[] values() {
        return (EncodeHintType[]) f29214g.clone();
    }
}
