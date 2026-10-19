package p142l3;

import B1.a;
import java.util.ArrayList;

/* JADX INFO: compiled from: FontCharacter.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f44348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f44349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44351e;

    public c(ArrayList arrayList, char c10, double d10, String str, String str2) {
        this.f44347a = arrayList;
        this.f44348b = c10;
        this.f44349c = d10;
        this.f44350d = str;
        this.f44351e = str2;
    }

    public static int a(char c10, String str, String str2) {
        return str2.hashCode() + a.b(str, c10 * 31, 31);
    }

    public final int hashCode() {
        return a(this.f44348b, this.f44351e, this.f44350d);
    }
}
