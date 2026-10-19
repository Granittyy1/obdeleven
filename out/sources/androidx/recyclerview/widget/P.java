package androidx.recyclerview.widget;

import android.view.View;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ViewBoundsCheck.java */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f19561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f19562b;

    /* JADX INFO: compiled from: ViewBoundsCheck.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19567e;

        public final boolean a() {
            int i10;
            int i11;
            int i12;
            int i13 = this.f19563a;
            int i14 = 2;
            if ((i13 & 7) != 0) {
                int i15 = this.f19566d;
                int i16 = this.f19564b;
                if (i15 > i16) {
                    i12 = 1;
                } else {
                    i12 = i15 == i16 ? 2 : 4;
                }
                if ((i12 & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 0) {
                int i17 = this.f19566d;
                int i18 = this.f19565c;
                if (i17 > i18) {
                    i11 = 1;
                } else {
                    i11 = i17 == i18 ? 2 : 4;
                }
                if (((i11 << 4) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 1792) != 0) {
                int i19 = this.f19567e;
                int i20 = this.f19564b;
                if (i19 > i20) {
                    i10 = 1;
                } else {
                    i10 = i19 == i20 ? 2 : 4;
                }
                if (((i10 << 8) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 28672) != 0) {
                int i21 = this.f19567e;
                int i22 = this.f19565c;
                if (i21 > i22) {
                    i14 = 1;
                } else if (i21 != i22) {
                    i14 = 4;
                }
                if ((i13 & (i14 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: ViewBoundsCheck.java */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i10);

        int e(View view);
    }

    public P(b bVar) {
        this.f19561a = bVar;
        a aVar = new a();
        aVar.f19563a = 0;
        this.f19562b = aVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        b bVar = this.f19561a;
        int iB = bVar.b();
        int iC = bVar.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewD = bVar.d(i10);
            int iA = bVar.a(viewD);
            int iE = bVar.e(viewD);
            a aVar = this.f19562b;
            aVar.f19564b = iB;
            aVar.f19565c = iC;
            aVar.f19566d = iA;
            aVar.f19567e = iE;
            if (i12 != 0) {
                aVar.f19563a = i12;
                if (aVar.a()) {
                    return viewD;
                }
            }
            if (i13 != 0) {
                aVar.f19563a = i13;
                if (aVar.a()) {
                    view = viewD;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f19561a;
        int iB = bVar.b();
        int iC = bVar.c();
        int iA = bVar.a(view);
        int iE = bVar.e(view);
        a aVar = this.f19562b;
        aVar.f19564b = iB;
        aVar.f19565c = iC;
        aVar.f19566d = iA;
        aVar.f19567e = iE;
        aVar.f19563a = 24579;
        return aVar.a();
    }
}
