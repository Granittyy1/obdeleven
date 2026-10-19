package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25471a;

    static {
        int[] iArr = new int[zzbv.values().length];
        f25471a = iArr;
        try {
            iArr[zzbv.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f25471a[zzbv.NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f25471a[zzbv.OR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
