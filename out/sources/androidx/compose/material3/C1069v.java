package androidx.compose.material3;

import androidx.compose.ui.text.C1260a;

/* JADX INFO: renamed from: androidx.compose.material3.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1069v implements androidx.compose.ui.text.input.E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.material3.internal.o f12756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f12760f;

    /* JADX INFO: renamed from: androidx.compose.material3.v$a */
    /* JADX INFO: compiled from: DateInput.kt */
    public static final class a implements androidx.compose.ui.text.input.r {
        public a() {
        }

        @Override // androidx.compose.ui.text.input.r
        public final int a(int i10) {
            C1069v c1069v = C1069v.this;
            if (i10 <= c1069v.f12757c - 1) {
                return i10;
            }
            if (i10 <= c1069v.f12758d - 1) {
                return i10 - 1;
            }
            int i11 = c1069v.f12759e;
            return i10 <= i11 + 1 ? i10 - 2 : i11;
        }

        @Override // androidx.compose.ui.text.input.r
        public final int b(int i10) {
            C1069v c1069v = C1069v.this;
            if (i10 < c1069v.f12757c) {
                return i10;
            }
            if (i10 < c1069v.f12758d) {
                return i10 + 1;
            }
            int i11 = c1069v.f12759e;
            return i10 <= i11 ? i10 + 2 : i11 + 2;
        }
    }

    public C1069v(androidx.compose.material3.internal.o oVar) {
        this.f12756b = oVar;
        String str = oVar.f12555a;
        char c10 = oVar.f12556b;
        this.f12757c = kotlin.text.n.P(str, c10, 0, false, 6);
        this.f12758d = kotlin.text.n.U(oVar.f12555a, c10, 0, 6);
        this.f12759e = oVar.f12557c.length();
        this.f12760f = new a();
    }

    @Override // androidx.compose.ui.text.input.E
    public final androidx.compose.ui.text.input.D e(C1260a c1260a) {
        int length = c1260a.f15408c.length();
        int i10 = 0;
        String strSubstring = c1260a.f15408c;
        int i11 = this.f12759e;
        if (length > i11) {
            Na.i range = Na.l.J(0, i11);
            kotlin.jvm.internal.i.e(strSubstring, "<this>");
            kotlin.jvm.internal.i.e(range, "range");
            strSubstring = strSubstring.substring(range.f4687b, range.f4688c + 1);
            kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        }
        String string = "";
        int i12 = 0;
        while (i10 < strSubstring.length()) {
            int i13 = i12 + 1;
            string = string + strSubstring.charAt(i10);
            if (i13 == this.f12757c || i12 + 2 == this.f12758d) {
                StringBuilder sbE = C4.b.e(string);
                sbE.append(this.f12756b.f12556b);
                string = sbE.toString();
            }
            i10++;
            i12 = i13;
        }
        return new androidx.compose.ui.text.input.D(new C1260a(6, string, null), this.f12760f);
    }
}
