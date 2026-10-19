package p015b2;

import I.e;
import android.text.TextUtils;
import p241t7.b;

/* JADX INFO: compiled from: SsaDialogueFormat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20511e;

    public a(int i10, int i11, int i12, int i13, int i14) {
        this.f20507a = i10;
        this.f20508b = i11;
        this.f20509c = i12;
        this.f20510d = i13;
        this.f20511e = i14;
    }

    public static a a(String str) {
        b.e(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strL = e.l(strArrSplit[i14].trim());
            strL.getClass();
            switch (strL) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new a(i10, i11, i12, i13, strArrSplit.length);
    }
}
