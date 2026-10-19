package p091h2;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p114j1.r;
import p114j1.w;

/* JADX INFO: compiled from: TsPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public interface F {

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f35801b;

        public a(String str, byte[] bArr) {
            this.f35800a = str;
            this.f35801b = bArr;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f35804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f35805d;

        public b(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
            this.f35802a = str;
            this.f35803b = i11;
            this.f35804c = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f35805d = bArr;
        }

        public final int a() {
            int i10 = this.f35803b;
            if (i10 != 2) {
                return i10 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f35809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f35810e;

        public c(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public final void a() {
            int i10 = this.f35809d;
            this.f35809d = i10 == Integer.MIN_VALUE ? this.f35807b : i10 + this.f35808c;
            this.f35810e = this.f35806a + this.f35809d;
        }

        public final void b() {
            if (this.f35809d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public c(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f35806a = str;
            this.f35807b = i11;
            this.f35808c = i12;
            this.f35809d = Integer.MIN_VALUE;
            this.f35810e = "";
        }
    }

    void a(int i10, r rVar) throws ParserException;

    void b(w wVar, A1.r rVar, c cVar);

    void c();
}
