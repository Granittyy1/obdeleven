package com.airbnb.lottie.model;

import B1.a;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class DocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Justification f23368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f23371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23373i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f23375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f23376m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Justification {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Justification f23377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Justification[] f23378c;

        /* JADX INFO: Fake field, exist only in values array */
        Justification EF0;

        static {
            Justification justification = new Justification("LEFT_ALIGN", 0);
            Justification justification2 = new Justification("RIGHT_ALIGN", 1);
            Justification justification3 = new Justification("CENTER", 2);
            f23377b = justification3;
            f23378c = new Justification[]{justification, justification2, justification3};
        }

        public Justification() {
            throw null;
        }

        public static Justification valueOf(String str) {
            return (Justification) Enum.valueOf(Justification.class, str);
        }

        public static Justification[] values() {
            return (Justification[]) f23378c.clone();
        }
    }

    public final int hashCode() {
        int iOrdinal = ((this.f23368d.ordinal() + (((int) (a.b(this.f23366b, this.f23365a.hashCode() * 31, 31) + this.f23367c)) * 31)) * 31) + this.f23369e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f23370f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f23372h;
    }
}
