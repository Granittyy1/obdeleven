package p127k1;

import java.util.ArrayList;
import java.util.Arrays;
import p114j1.r;

/* JADX INFO: compiled from: Mp4Box.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41389a;

    /* JADX INFO: compiled from: Mp4Box.java */
    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f41390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f41391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f41392d;

        public a(int i10, long j) {
            super(i10);
            this.f41390b = j;
            this.f41391c = new ArrayList();
            this.f41392d = new ArrayList();
        }

        public final a b(int i10) {
            ArrayList arrayList = this.f41392d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) arrayList.get(i11);
                if (aVar.f41389a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public final C0471b c(int i10) {
            ArrayList arrayList = this.f41391c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0471b c0471b = (C0471b) arrayList.get(i11);
                if (c0471b.f41389a == i10) {
                    return c0471b;
                }
            }
            return null;
        }

        @Override // p127k1.b
        public final String toString() {
            return b.a(this.f41389a) + " leaves: " + Arrays.toString(this.f41391c.toArray()) + " containers: " + Arrays.toString(this.f41392d.toArray());
        }
    }

    /* JADX INFO: renamed from: k1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Mp4Box.java */
    public static final class C0471b extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f41393b;

        public C0471b(int i10, r rVar) {
            super(i10);
            this.f41393b = rVar;
        }
    }

    public b(int i10) {
        this.f41389a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f41389a);
    }
}
