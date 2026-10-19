package androidx.media3.ui;

import X5.ViewOnClickListenerC0832a;
import Z3.z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.common.collect.ImmutableList;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.H0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p078g1.A;
import p078g1.B;
import p078g1.C2196b;
import p078g1.n;
import p078g1.q;
import p078g1.u;
import p078g1.v;
import p078g1.x;
import p078g1.y;

/* JADX INFO: compiled from: PlayerControlView.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FrameLayout {

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public static final float[] f18918Q0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final View f18919A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public InterfaceC0190c f18920A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f18921B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f18922B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final View f18923C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f18924C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final TextView f18925D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f18926D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final TextView f18927E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f18928E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final androidx.media3.ui.f f18929F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f18930F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final StringBuilder f18931G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f18932G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Formatter f18933H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f18934H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final x.b f18935I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f18936I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final x.c f18937J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f18938J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final M2.e f18939K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public long[] f18940K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Drawable f18941L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean[] f18942L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Drawable f18943M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final long[] f18944M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Drawable f18945N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final boolean[] f18946N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Drawable f18947O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public long f18948O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Drawable f18949P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f18950P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final String f18951Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final String f18952R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final String f18953S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final Drawable f18954T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Drawable f18955U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final float f18956V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final float f18957W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p128k2.j f18958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f18959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f18960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList<l> f18961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f18962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f18963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f18964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f18965i;
    public final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z f18966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow f18967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f18969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f18970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f18971p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f18972p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f18973q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f18974q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f18975r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Drawable f18976r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f18977s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Drawable f18978s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f18979t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f18980t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f18981u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f18982u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f18983v;
    public final Drawable v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f18984w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Drawable f18985w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f18986x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final String f18987x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f18988y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final String f18989y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f18990z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public v f18991z0;

    /* JADX INFO: compiled from: PlayerControlView.java */
    public final class a extends k {
        public a() {
            super();
        }

        @Override // androidx.media3.ui.c.k
        public final void b(h hVar) {
            hVar.f19006b.setText(R.string.exo_track_selection_auto);
            v vVar = c.this.f18991z0;
            vVar.getClass();
            hVar.f19007c.setVisibility(d(vVar.U()) ? 4 : 0);
            hVar.itemView.setOnClickListener(new com.voltasit.obdeleven.presentation.controlUnit.i(4, this));
        }

        @Override // androidx.media3.ui.c.k
        public final void c(String str) {
            c.this.f18963g.f19003b[1] = str;
        }

        public final boolean d(A a10) {
            for (int i10 = 0; i10 < this.f19012a.size(); i10++) {
                if (a10.f35198s.containsKey(this.f19012a.get(i10).f19009a.f35223b)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    public final class b implements v.c, androidx.media3.ui.f.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // androidx.media3.ui.f.a
        public final void H(long j, boolean z10) {
            v vVar;
            c cVar = c.this;
            int i10 = 0;
            cVar.f18932G0 = false;
            if (!z10 && (vVar = cVar.f18991z0) != null) {
                if (cVar.f18930F0) {
                    if (vVar.L(17) && vVar.L(10)) {
                        x xVarR = vVar.R();
                        int iO = xVarR.o();
                        while (true) {
                            long jQ = p114j1.A.Q(xVarR.m(i10, cVar.f18937J, 0L).f35487l);
                            if (j < jQ) {
                                break;
                            }
                            if (i10 == iO - 1) {
                                j = jQ;
                                break;
                            } else {
                                j -= jQ;
                                i10++;
                            }
                        }
                        vVar.i(i10, j);
                    }
                } else if (vVar.L(5)) {
                    vVar.t(j);
                }
                cVar.o();
            }
            cVar.f18958b.g();
        }

        @Override // g1.v.c
        public final void Y(v.b bVar) {
            boolean zA = bVar.a(4, 5, 13);
            c cVar = c.this;
            if (zA) {
                cVar.m();
            }
            if (bVar.a(4, 5, 7, 13)) {
                cVar.o();
            }
            if (bVar.a(8, 13)) {
                cVar.p();
            }
            if (bVar.a(9, 13)) {
                cVar.r();
            }
            if (bVar.a(8, 9, 11, 0, 16, 17, 13)) {
                cVar.l();
            }
            if (bVar.a(11, 0, 13)) {
                cVar.s();
            }
            if (bVar.a(12, 13)) {
                cVar.n();
            }
            if (bVar.a(2, 13)) {
                cVar.t();
            }
        }

        @Override // androidx.media3.ui.f.a
        public final void k(long j) {
            c cVar = c.this;
            TextView textView = cVar.f18927E;
            if (textView != null) {
                textView.setText(p114j1.A.u(cVar.f18931G, cVar.f18933H, j));
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = c.this;
            v vVar = cVar.f18991z0;
            if (vVar == null) {
                return;
            }
            p128k2.j jVar = cVar.f18958b;
            jVar.g();
            if (cVar.f18970o == view) {
                if (vVar.L(9)) {
                    vVar.W();
                    return;
                }
                return;
            }
            if (cVar.f18969n == view) {
                if (vVar.L(7)) {
                    vVar.w();
                    return;
                }
                return;
            }
            if (cVar.f18973q == view) {
                if (vVar.C() == 4 || !vVar.L(12)) {
                    return;
                }
                vVar.X();
                return;
            }
            if (cVar.f18975r == view) {
                if (vVar.L(11)) {
                    vVar.Z();
                    return;
                }
                return;
            }
            if (cVar.f18971p == view) {
                if (p114j1.A.N(vVar, cVar.f18928E0)) {
                    p114j1.A.y(vVar);
                    return;
                } else {
                    if (vVar.L(1)) {
                        vVar.c();
                        return;
                    }
                    return;
                }
            }
            if (cVar.f18981u == view) {
                if (vVar.L(15)) {
                    int iQ = vVar.Q();
                    int i10 = cVar.f18938J0;
                    for (int i11 = 1; i11 <= 2; i11++) {
                        int i12 = (iQ + i11) % 3;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2 || (i10 & 2) == 0) {
                                }
                            } else if ((i10 & 1) == 0) {
                            }
                        }
                        iQ = i12;
                    }
                    vVar.M(iQ);
                    return;
                }
                return;
            }
            if (cVar.f18983v == view) {
                if (vVar.L(14)) {
                    vVar.k(!vVar.T());
                    return;
                }
                return;
            }
            View view2 = cVar.f18919A;
            if (view2 == view) {
                jVar.f();
                cVar.d(cVar.f18963g, view2);
                return;
            }
            View view3 = cVar.f18921B;
            if (view3 == view) {
                jVar.f();
                cVar.d(cVar.f18964h, view3);
                return;
            }
            View view4 = cVar.f18923C;
            if (view4 == view) {
                jVar.f();
                cVar.d(cVar.j, view4);
                return;
            }
            ImageView imageView = cVar.f18986x;
            if (imageView == view) {
                jVar.f();
                cVar.d(cVar.f18965i, imageView);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            c cVar = c.this;
            if (cVar.f18950P0) {
                cVar.f18958b.g();
            }
        }

        @Override // androidx.media3.ui.f.a
        public final void s(long j) {
            c cVar = c.this;
            cVar.f18932G0 = true;
            TextView textView = cVar.f18927E;
            if (textView != null) {
                textView.setText(p114j1.A.u(cVar.f18931G, cVar.f18933H, j));
            }
            cVar.f18958b.f();
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PlayerControlView.java */
    @Deprecated
    public interface InterfaceC0190c {
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    public final class d extends RecyclerView.Adapter<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f18994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f18995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18996c;

        public d(String[] strArr, float[] fArr) {
            this.f18994a = strArr;
            this.f18995b = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f18994a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.B b10, final int i10) {
            h hVar = (h) b10;
            String[] strArr = this.f18994a;
            if (i10 < strArr.length) {
                hVar.f19006b.setText(strArr[i10]);
            }
            if (i10 == this.f18996c) {
                hVar.itemView.setSelected(true);
                hVar.f19007c.setVisibility(0);
            } else {
                hVar.itemView.setSelected(false);
                hVar.f19007c.setVisibility(4);
            }
            hVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: k2.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.d dVar = this.f41485b;
                    int i11 = dVar.f18996c;
                    int i12 = i10;
                    c cVar = c.this;
                    if (i12 != i11) {
                        cVar.setPlaybackSpeed(dVar.f18995b[i12]);
                    }
                    cVar.f18967l.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new h(LayoutInflater.from(c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    public interface e {
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    public final class f extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f18998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f18999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f19000d;

        public f(View view) {
            super(view);
            if (p114j1.A.f40996a < 26) {
                view.setFocusable(true);
            }
            this.f18998b = (TextView) view.findViewById(R.id.exo_main_text);
            this.f18999c = (TextView) view.findViewById(R.id.exo_sub_text);
            this.f19000d = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new com.voltasit.obdeleven.presentation.dialogs.bonus.b(3, this));
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    public class g extends RecyclerView.Adapter<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f19002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f19003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Drawable[] f19004c;

        public g(String[] strArr, Drawable[] drawableArr) {
            this.f19002a = strArr;
            this.f19003b = new String[strArr.length];
            this.f19004c = drawableArr;
        }

        public final boolean a(int i10) {
            c cVar = c.this;
            v vVar = cVar.f18991z0;
            if (vVar == null) {
                return false;
            }
            if (i10 == 0) {
                return vVar.L(13);
            }
            if (i10 != 1) {
                return true;
            }
            return vVar.L(30) && cVar.f18991z0.L(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f19002a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.B b10, int i10) {
            f fVar = (f) b10;
            if (a(i10)) {
                fVar.itemView.setLayoutParams(new RecyclerView.m(-1, -2));
            } else {
                fVar.itemView.setLayoutParams(new RecyclerView.m(0, 0));
            }
            fVar.f18998b.setText(this.f19002a[i10]);
            String str = this.f19003b[i10];
            TextView textView = fVar.f18999c;
            if (str == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            Drawable drawable = this.f19004c[i10];
            ImageView imageView = fVar.f19000d;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
            c cVar = c.this;
            return cVar.new f(LayoutInflater.from(cVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    public static class h extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f19006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f19007c;

        public h(View view) {
            super(view);
            if (p114j1.A.f40996a < 26) {
                view.setFocusable(true);
            }
            this.f19006b = (TextView) view.findViewById(R.id.exo_text);
            this.f19007c = view.findViewById(R.id.exo_check);
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B.a f19009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f19011c;

        public j(B b10, int i10, int i11, String str) {
            this.f19009a = b10.f35221a.get(i10);
            this.f19010b = i11;
            this.f19011c = str;
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    public abstract class k extends RecyclerView.Adapter<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<j> f19012a = new ArrayList();

        public k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a */
        public void onBindViewHolder(h hVar, int i10) {
            final v vVar = c.this.f18991z0;
            if (vVar == null) {
                return;
            }
            if (i10 == 0) {
                b(hVar);
                return;
            }
            final j jVar = this.f19012a.get(i10 - 1);
            final y yVar = jVar.f19009a.f35223b;
            boolean z10 = vVar.U().f35198s.get(yVar) != null && jVar.f19009a.f35226e[jVar.f19010b];
            hVar.f19006b.setText(jVar.f19011c);
            hVar.f19007c.setVisibility(z10 ? 0 : 4);
            hVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: k2.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.k kVar = this.f41487b;
                    kVar.getClass();
                    v vVar2 = vVar;
                    if (vVar2.L(29)) {
                        A.b bVarA = vVar2.U().a();
                        c.j jVar2 = jVar;
                        vVar2.z(bVarA.e(new p078g1.z(yVar, ImmutableList.M(Integer.valueOf(jVar2.f19010b)))).i(jVar2.f19009a.f35223b.f35493c).a());
                        kVar.c(jVar2.f19011c);
                        c.this.f18967l.dismiss();
                    }
                }
            });
        }

        public abstract void b(h hVar);

        public abstract void c(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            if (this.f19012a.isEmpty()) {
                return 0;
            }
            return this.f19012a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new h(LayoutInflater.from(c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    @Deprecated
    public interface l {
        void k(int i10);
    }

    static {
        q.a("media3.ui");
        f18918Q0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public c(Context context) {
        super(context, null, 0);
        this.f18928E0 = true;
        this.f18934H0 = InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        this.f18938J0 = 0;
        this.f18936I0 = t.d.DEFAULT_DRAG_ANIMATION_DURATION;
        LayoutInflater.from(context).inflate(R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        b bVar = new b();
        this.f18960d = bVar;
        this.f18961e = new CopyOnWriteArrayList<>();
        this.f18935I = new x.b();
        this.f18937J = new x.c();
        StringBuilder sb2 = new StringBuilder();
        this.f18931G = sb2;
        this.f18933H = new Formatter(sb2, Locale.getDefault());
        this.f18940K0 = new long[0];
        this.f18942L0 = new boolean[0];
        this.f18944M0 = new long[0];
        this.f18946N0 = new boolean[0];
        this.f18939K = new M2.e(4, this);
        this.f18925D = (TextView) findViewById(R.id.exo_duration);
        this.f18927E = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f18986x = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f18988y = imageView2;
        H0 h8 = new H0(1, this);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(h8);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f18990z = imageView3;
        H0 h10 = new H0(1, this);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(h10);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f18919A = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(bVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f18921B = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(bVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f18923C = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(bVar);
        }
        androidx.media3.ui.f fVar = (androidx.media3.ui.f) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (fVar != null) {
            this.f18929F = fVar;
        } else if (viewFindViewById4 != null) {
            androidx.media3.ui.b bVar2 = new androidx.media3.ui.b(context);
            bVar2.setId(R.id.exo_progress);
            bVar2.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(bVar2, iIndexOfChild);
            this.f18929F = bVar2;
        } else {
            this.f18929F = null;
        }
        androidx.media3.ui.f fVar2 = this.f18929F;
        if (fVar2 != null) {
            fVar2.b(bVar);
        }
        Resources resources = context.getResources();
        this.f18959c = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.f18971p = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(bVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.f18969n = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_previous, context.getTheme()));
            imageView5.setOnClickListener(bVar);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.f18970o = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_next, context.getTheme()));
            imageView6.setOnClickListener(bVar);
        }
        Typeface typefaceA = p211r0.f.a(context, R.font.roboto_medium_numbers);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_rewind, context.getTheme()));
            this.f18975r = imageView7;
            this.f18979t = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceA);
            this.f18979t = textView;
            this.f18975r = textView;
        } else {
            this.f18979t = null;
            this.f18975r = null;
        }
        View view = this.f18975r;
        if (view != null) {
            view.setOnClickListener(bVar);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_fastforward, context.getTheme()));
            this.f18973q = imageView8;
            this.f18977s = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceA);
            this.f18977s = textView2;
            this.f18973q = textView2;
        } else {
            this.f18977s = null;
            this.f18973q = null;
        }
        View view2 = this.f18973q;
        if (view2 != null) {
            view2.setOnClickListener(bVar);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f18981u = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(bVar);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f18983v = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(bVar);
        }
        this.f18956V = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f18957W = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.f18984w = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_vr, context.getTheme()));
            j(imageView11, false);
        }
        p128k2.j jVar = new p128k2.j(this);
        this.f18958b = jVar;
        jVar.f41497C = true;
        g gVar = new g(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.f18963g = gVar;
        this.f18968m = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f18962f = recyclerView;
        recyclerView.setAdapter(gVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f18967l = popupWindow;
        if (p114j1.A.f40996a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(bVar);
        this.f18950P0 = true;
        this.f18966k = new z(getResources());
        this.f18976r0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on, context.getTheme());
        this.f18978s0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off, context.getTheme());
        this.f18980t0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f18982u0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f18965i = new i();
        this.j = new a();
        this.f18964h = new d(resources.getStringArray(R.array.exo_controls_playback_speeds), f18918Q0);
        this.f18941L = resources.getDrawable(R.drawable.exo_styled_controls_play, context.getTheme());
        this.f18943M = resources.getDrawable(R.drawable.exo_styled_controls_pause, context.getTheme());
        this.v0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit, context.getTheme());
        this.f18985w0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter, context.getTheme());
        this.f18945N = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off, context.getTheme());
        this.f18947O = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one, context.getTheme());
        this.f18949P = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all, context.getTheme());
        this.f18954T = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on, context.getTheme());
        this.f18955U = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off, context.getTheme());
        this.f18987x0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f18989y0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f18951Q = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f18952R = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f18953S = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f18972p0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f18974q0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        jVar.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        jVar.h(this.f18973q, true);
        jVar.h(this.f18975r, true);
        jVar.h(imageView5, true);
        jVar.h(imageView6, true);
        jVar.h(imageView10, false);
        jVar.h(imageView, false);
        jVar.h(imageView11, false);
        jVar.h(imageView9, this.f18938J0 != 0);
        addOnLayoutChangeListener(new p128k2.c(0, this));
    }

    public static boolean b(v vVar, x.c cVar) {
        x xVarR;
        int iO;
        if (!vVar.L(17) || (iO = (xVarR = vVar.R()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i10 = 0; i10 < iO; i10++) {
            if (xVarR.m(i10, cVar, 0L).f35487l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        v vVar = this.f18991z0;
        if (vVar == null || !vVar.L(13)) {
            return;
        }
        v vVar2 = this.f18991z0;
        vVar2.e(new u(f10, vVar2.g().f35453b));
    }

    public final boolean c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        v vVar = this.f18991z0;
        if (vVar == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (vVar.C() != 4 && vVar.L(12)) {
                    vVar.X();
                }
            } else if (keyCode == 89 && vVar.L(11)) {
                vVar.Z();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (p114j1.A.N(vVar, this.f18928E0)) {
                        p114j1.A.y(vVar);
                    } else if (vVar.L(1)) {
                        vVar.c();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            p114j1.A.y(vVar);
                        } else if (keyCode == 127) {
                            int i10 = p114j1.A.f40996a;
                            if (vVar.L(1)) {
                                vVar.c();
                            }
                        }
                    } else if (vVar.L(7)) {
                        vVar.w();
                    }
                } else if (vVar.L(9)) {
                    vVar.W();
                }
            }
        }
        return true;
    }

    public final void d(RecyclerView.Adapter<?> adapter, View view) {
        this.f18962f.setAdapter(adapter);
        q();
        this.f18950P0 = false;
        PopupWindow popupWindow = this.f18967l;
        popupWindow.dismiss();
        this.f18950P0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i10 = this.f18968m;
        popupWindow.showAsDropDown(view, width - i10, (-popupWindow.getHeight()) - i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final ImmutableList<j> e(B b10, int i10) {
        ImmutableList.a aVar = new ImmutableList.a();
        ImmutableList<B.a> immutableList = b10.f35221a;
        for (int i11 = 0; i11 < immutableList.size(); i11++) {
            B.a aVar2 = immutableList.get(i11);
            if (aVar2.f35223b.f35493c == i10) {
                for (int i12 = 0; i12 < aVar2.f35222a; i12++) {
                    if (aVar2.b(i12)) {
                        n nVar = aVar2.f35223b.f35494d[i12];
                        if ((nVar.f35294e & 2) == 0) {
                            aVar.c(new j(b10, i11, i12, this.f18966k.a(nVar)));
                        }
                    }
                }
            }
        }
        return aVar.h();
    }

    public final void f() {
        p128k2.j jVar = this.f18958b;
        int i10 = jVar.f41522z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        jVar.f();
        if (!jVar.f41497C) {
            jVar.i(2);
        } else if (jVar.f41522z == 1) {
            jVar.f41509m.start();
        } else {
            jVar.f41510n.start();
        }
    }

    public final boolean g() {
        p128k2.j jVar = this.f18958b;
        return jVar.f41522z == 0 && jVar.f41498a.h();
    }

    public v getPlayer() {
        return this.f18991z0;
    }

    public int getRepeatToggleModes() {
        return this.f18938J0;
    }

    public boolean getShowShuffleButton() {
        return this.f18958b.b(this.f18983v);
    }

    public boolean getShowSubtitleButton() {
        return this.f18958b.b(this.f18986x);
    }

    public int getShowTimeoutMs() {
        return this.f18934H0;
    }

    public boolean getShowVrButton() {
        return this.f18958b.b(this.f18984w);
    }

    public final boolean h() {
        return getVisibility() == 0;
    }

    public final void i() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void j(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.f18956V : this.f18957W);
    }

    public final void k(boolean z10) {
        if (this.f18922B0 == z10) {
            return;
        }
        this.f18922B0 = z10;
        String str = this.f18989y0;
        Drawable drawable = this.f18985w0;
        String str2 = this.f18987x0;
        Drawable drawable2 = this.v0;
        ImageView imageView = this.f18988y;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.f18990z;
        if (imageView2 != null) {
            if (z10) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        InterfaceC0190c interfaceC0190c = this.f18920A0;
        if (interfaceC0190c != null) {
            androidx.media3.ui.d.this.getClass();
        }
    }

    public final void l() {
        boolean zL;
        boolean zL2;
        boolean zL3;
        boolean zL4;
        boolean zL5;
        if (h() && this.f18924C0) {
            v vVar = this.f18991z0;
            if (vVar != null) {
                zL = (this.f18926D0 && b(vVar, this.f18937J)) ? vVar.L(10) : vVar.L(5);
                zL3 = vVar.L(7);
                zL4 = vVar.L(11);
                zL5 = vVar.L(12);
                zL2 = vVar.L(9);
            } else {
                zL = false;
                zL2 = false;
                zL3 = false;
                zL4 = false;
                zL5 = false;
            }
            Resources resources = this.f18959c;
            View view = this.f18975r;
            if (zL4) {
                v vVar2 = this.f18991z0;
                int iC0 = (int) ((vVar2 != null ? vVar2.c0() : 5000L) / 1000);
                TextView textView = this.f18979t;
                if (textView != null) {
                    textView.setText(String.valueOf(iC0));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, iC0, Integer.valueOf(iC0)));
                }
            }
            View view2 = this.f18973q;
            if (zL5) {
                v vVar3 = this.f18991z0;
                int iY = (int) ((vVar3 != null ? vVar3.y() : 15000L) / 1000);
                TextView textView2 = this.f18977s;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iY));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, iY, Integer.valueOf(iY)));
                }
            }
            j(this.f18969n, zL3);
            j(view, zL4);
            j(view2, zL5);
            j(this.f18970o, zL2);
            androidx.media3.ui.f fVar = this.f18929F;
            if (fVar != null) {
                fVar.setEnabled(zL);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    public final void m() {
        ImageView imageView;
        boolean z10;
        if (h() && this.f18924C0 && (imageView = this.f18971p) != null) {
            boolean zN = p114j1.A.N(this.f18991z0, this.f18928E0);
            Drawable drawable = zN ? this.f18941L : this.f18943M;
            int i10 = zN ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f18959c.getString(i10));
            v vVar = this.f18991z0;
            if (vVar != null) {
                z10 = true;
                if (!vVar.L(1) || (vVar.L(17) && vVar.R().p())) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            j(imageView, z10);
        }
    }

    public final void n() {
        d dVar;
        v vVar = this.f18991z0;
        if (vVar == null) {
            return;
        }
        float f10 = vVar.g().f35452a;
        float f11 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            dVar = this.f18964h;
            float[] fArr = dVar.f18995b;
            if (i10 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f10 - fArr[i10]);
            if (fAbs < f11) {
                i11 = i10;
                f11 = fAbs;
            }
            i10++;
        }
        dVar.f18996c = i11;
        String str = dVar.f18994a[i11];
        g gVar = this.f18963g;
        gVar.f19003b[0] = str;
        j(this.f18919A, gVar.a(1) || gVar.a(0));
    }

    public final void o() {
        long jA;
        long jV;
        if (h() && this.f18924C0) {
            v vVar = this.f18991z0;
            if (vVar == null || !vVar.L(16)) {
                jA = 0;
                jV = 0;
            } else {
                jA = vVar.A() + this.f18948O0;
                jV = vVar.V() + this.f18948O0;
            }
            TextView textView = this.f18927E;
            if (textView != null && !this.f18932G0) {
                textView.setText(p114j1.A.u(this.f18931G, this.f18933H, jA));
            }
            androidx.media3.ui.f fVar = this.f18929F;
            if (fVar != null) {
                fVar.setPosition(jA);
                fVar.setBufferedPosition(jV);
            }
            M2.e eVar = this.f18939K;
            removeCallbacks(eVar);
            int iC = vVar == null ? 1 : vVar.C();
            if (vVar != null && vVar.F()) {
                long jMin = Math.min(fVar != null ? fVar.getPreferredUpdateDelay() : 1000L, 1000 - (jA % 1000));
                float f10 = vVar.g().f35452a;
                postDelayed(eVar, p114j1.A.h(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f18936I0, 1000L));
            } else {
                if (iC == 4 || iC == 1) {
                    return;
                }
                postDelayed(eVar, 1000L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p128k2.j jVar = this.f18958b;
        jVar.f41498a.addOnLayoutChangeListener(jVar.f41520x);
        this.f18924C0 = true;
        if (g()) {
            jVar.g();
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p128k2.j jVar = this.f18958b;
        jVar.f41498a.removeOnLayoutChangeListener(jVar.f41520x);
        this.f18924C0 = false;
        removeCallbacks(this.f18939K);
        jVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f18958b.f41499b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public final void p() {
        ImageView imageView;
        if (h() && this.f18924C0 && (imageView = this.f18981u) != null) {
            if (this.f18938J0 == 0) {
                j(imageView, false);
                return;
            }
            v vVar = this.f18991z0;
            String str = this.f18951Q;
            Drawable drawable = this.f18945N;
            if (vVar == null || !vVar.L(15)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            int iQ = vVar.Q();
            if (iQ == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iQ == 1) {
                imageView.setImageDrawable(this.f18947O);
                imageView.setContentDescription(this.f18952R);
            } else {
                if (iQ != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f18949P);
                imageView.setContentDescription(this.f18953S);
            }
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.f18962f;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i10 = this.f18968m;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i10 * 2));
        PopupWindow popupWindow = this.f18967l;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i10 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        ImageView imageView;
        if (h() && this.f18924C0 && (imageView = this.f18983v) != null) {
            v vVar = this.f18991z0;
            if (!this.f18958b.b(imageView)) {
                j(imageView, false);
                return;
            }
            String str = this.f18974q0;
            Drawable drawable = this.f18955U;
            if (vVar == null || !vVar.L(14)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            if (vVar.T()) {
                drawable = this.f18954T;
            }
            imageView.setImageDrawable(drawable);
            if (vVar.T()) {
                str = this.f18972p0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r2v11, types: [g1.x] */
    /* JADX WARN: Type inference failed for: r2v12, types: [g1.x] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [g1.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [g1.x$b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s() {
        long jF;
        int i10;
        ?? r20;
        ?? r10;
        boolean z10;
        v vVar = this.f18991z0;
        if (vVar == null) {
            return;
        }
        boolean z11 = this.f18926D0;
        boolean z12 = false;
        boolean z13 = true;
        x.c cVar = this.f18937J;
        this.f18930F0 = z11 && b(vVar, cVar);
        this.f18948O0 = 0L;
        x xVarR = vVar.L(17) ? vVar.R() : x.f35467a;
        long j10 = -9223372036854775807L;
        if (xVarR.p()) {
            if (vVar.L(16)) {
                long jL = vVar.l();
                if (jL != -9223372036854775807L) {
                    jF = p114j1.A.F(jL);
                } else {
                    jF = 0;
                }
            } else {
                jF = 0;
            }
            i10 = 0;
        } else {
            int iK = vVar.K();
            boolean z14 = this.f18930F0;
            int i11 = z14 ? 0 : iK;
            int iO = z14 ? xVarR.o() - 1 : iK;
            i10 = 0;
            long j11 = 0;
            ?? r11 = xVarR;
            while (i11 <= iO) {
                if (i11 == iK) {
                    this.f18948O0 = p114j1.A.Q(j11);
                }
                r11.n(i11, cVar);
                if (cVar.f35487l == j10) {
                    p241t7.b.k(this.f18930F0 ^ z13);
                    break;
                }
                int i12 = cVar.f35488m;
                ?? r12 = r11;
                boolean z15 = z12;
                while (i12 <= cVar.f35489n) {
                    ?? r13 = this.f18935I;
                    r12.f(i12, r13, z15);
                    C2196b c2196b = r13.f35474g;
                    c2196b.getClass();
                    ?? r14 = r12;
                    for (?? r15 = z15; r15 < c2196b.f35235a; r15++) {
                        r13.d(r15);
                        long j12 = r13.f35472e;
                        if (j12 >= 0) {
                            long[] jArr = this.f18940K0;
                            if (i10 == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f18940K0 = Arrays.copyOf(jArr, length);
                                this.f18942L0 = Arrays.copyOf(this.f18942L0, length);
                            }
                            this.f18940K0[i10] = p114j1.A.Q(j12 + j11);
                            boolean[] zArr = this.f18942L0;
                            C2196b.a aVarA = r13.f35474g.a(r15);
                            int i13 = aVarA.f35237a;
                            if (i13 != -1) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= i13) {
                                        r10 = r14;
                                        r20 = r10;
                                        z13 = true;
                                        z10 = false;
                                        break;
                                    }
                                    ?? r21 = r10;
                                    int i15 = aVarA.f35241e[i14];
                                    if (i15 != 0) {
                                        C2196b.a aVar = aVarA;
                                        z13 = true;
                                        if (i15 == 1) {
                                            r10 = r14;
                                        } else {
                                            r10 = r14;
                                            i14++;
                                            r10 = r21;
                                            aVarA = aVar;
                                        }
                                    } else {
                                        r10 = r14;
                                        z13 = true;
                                    }
                                    z10 = z13;
                                    r20 = r21;
                                    break;
                                }
                            }
                            r20 = r14;
                            z13 = true;
                            z10 = true;
                            zArr[i10] = !z10;
                            i10++;
                        } else {
                            r20 = r14;
                        }
                        iK = iK;
                        r14 = r20;
                    }
                    i12++;
                    z15 = false;
                    r12 = r14;
                }
                j11 += cVar.f35487l;
                i11++;
                iK = iK;
                r11 = r12;
                z12 = false;
                j10 = -9223372036854775807L;
            }
            jF = j11;
        }
        long jQ = p114j1.A.Q(jF);
        TextView textView = this.f18925D;
        if (textView != null) {
            textView.setText(p114j1.A.u(this.f18931G, this.f18933H, jQ));
        }
        androidx.media3.ui.f fVar = this.f18929F;
        if (fVar != null) {
            fVar.setDuration(jQ);
            long[] jArr2 = this.f18944M0;
            int length2 = jArr2.length;
            int i16 = i10 + length2;
            long[] jArr3 = this.f18940K0;
            if (i16 > jArr3.length) {
                this.f18940K0 = Arrays.copyOf(jArr3, i16);
                this.f18942L0 = Arrays.copyOf(this.f18942L0, i16);
            }
            System.arraycopy(jArr2, 0, this.f18940K0, i10, length2);
            System.arraycopy(this.f18946N0, 0, this.f18942L0, i10, length2);
            fVar.a(this.f18940K0, this.f18942L0, i16);
        }
        o();
    }

    public void setAnimationEnabled(boolean z10) {
        this.f18958b.f41497C = z10;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC0190c interfaceC0190c) {
        this.f18920A0 = interfaceC0190c;
        boolean z10 = interfaceC0190c != null;
        ImageView imageView = this.f18988y;
        if (imageView != null) {
            if (z10) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z11 = interfaceC0190c != null;
        ImageView imageView2 = this.f18990z;
        if (imageView2 == null) {
            return;
        }
        if (z11) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(v vVar) {
        p241t7.b.k(Looper.myLooper() == Looper.getMainLooper());
        p241t7.b.e(vVar == null || vVar.S() == Looper.getMainLooper());
        v vVar2 = this.f18991z0;
        if (vVar2 == vVar) {
            return;
        }
        b bVar = this.f18960d;
        if (vVar2 != null) {
            vVar2.v(bVar);
        }
        this.f18991z0 = vVar;
        if (vVar != null) {
            vVar.u(bVar);
        }
        i();
    }

    public void setRepeatToggleModes(int i10) {
        this.f18938J0 = i10;
        v vVar = this.f18991z0;
        if (vVar != null && vVar.L(15)) {
            int iQ = this.f18991z0.Q();
            if (i10 == 0 && iQ != 0) {
                this.f18991z0.M(0);
            } else if (i10 == 1 && iQ == 2) {
                this.f18991z0.M(1);
            } else if (i10 == 2 && iQ == 1) {
                this.f18991z0.M(2);
            }
        }
        this.f18958b.h(this.f18981u, i10 != 0);
        p();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f18958b.h(this.f18973q, z10);
        l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f18926D0 = z10;
        s();
    }

    public void setShowNextButton(boolean z10) {
        this.f18958b.h(this.f18970o, z10);
        l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f18928E0 = z10;
        m();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f18958b.h(this.f18969n, z10);
        l();
    }

    public void setShowRewindButton(boolean z10) {
        this.f18958b.h(this.f18975r, z10);
        l();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f18958b.h(this.f18983v, z10);
        r();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f18958b.h(this.f18986x, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f18934H0 = i10;
        if (g()) {
            this.f18958b.g();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f18958b.h(this.f18984w, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f18936I0 = p114j1.A.g(i10, 16, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f18984w;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            j(imageView, onClickListener != null);
        }
    }

    public final void t() {
        i iVar = this.f18965i;
        iVar.getClass();
        iVar.f19012a = Collections.emptyList();
        a aVar = this.j;
        aVar.getClass();
        aVar.f19012a = Collections.emptyList();
        v vVar = this.f18991z0;
        ImageView imageView = this.f18986x;
        if (vVar != null && vVar.L(30) && this.f18991z0.L(29)) {
            B bD = this.f18991z0.D();
            ImmutableList<j> immutableListE = e(bD, 1);
            aVar.f19012a = immutableListE;
            c cVar = c.this;
            v vVar2 = cVar.f18991z0;
            vVar2.getClass();
            A aU = vVar2.U();
            boolean zIsEmpty = immutableListE.isEmpty();
            g gVar = cVar.f18963g;
            if (zIsEmpty) {
                gVar.f19003b[1] = cVar.getResources().getString(R.string.exo_track_selection_none);
            } else if (aVar.d(aU)) {
                for (int i10 = 0; i10 < immutableListE.size(); i10++) {
                    j jVar = immutableListE.get(i10);
                    if (jVar.f19009a.f35226e[jVar.f19010b]) {
                        gVar.f19003b[1] = jVar.f19011c;
                        break;
                    }
                }
            } else {
                gVar.f19003b[1] = cVar.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.f18958b.b(imageView)) {
                iVar.d(e(bD, 3));
            } else {
                iVar.d(ImmutableList.K());
            }
        }
        j(imageView, iVar.getItemCount() > 0);
        g gVar2 = this.f18963g;
        j(this.f18919A, gVar2.a(1) || gVar2.a(0));
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    public final class i extends k {
        public i() {
            super();
        }

        @Override // androidx.media3.ui.c.k, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(h hVar, int i10) {
            super.onBindViewHolder(hVar, i10);
            if (i10 > 0) {
                j jVar = this.f19012a.get(i10 - 1);
                hVar.f19007c.setVisibility(jVar.f19009a.f35226e[jVar.f19010b] ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.c.k
        public final void b(h hVar) {
            hVar.f19006b.setText(R.string.exo_track_selection_none);
            int i10 = 0;
            for (int i11 = 0; i11 < this.f19012a.size(); i11++) {
                j jVar = this.f19012a.get(i11);
                if (jVar.f19009a.f35226e[jVar.f19010b]) {
                    i10 = 4;
                    break;
                }
            }
            hVar.f19007c.setVisibility(i10);
            hVar.itemView.setOnClickListener(new ViewOnClickListenerC0832a(4, this));
        }

        public final void d(List<j> list) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                j jVar = list.get(i10);
                if (jVar.f19009a.f35226e[jVar.f19010b]) {
                    z10 = true;
                    break;
                }
            }
            c cVar = c.this;
            ImageView imageView = cVar.f18986x;
            if (imageView != null) {
                imageView.setImageDrawable(z10 ? cVar.f18976r0 : cVar.f18978s0);
                cVar.f18986x.setContentDescription(z10 ? cVar.f18980t0 : cVar.f18982u0);
            }
            this.f19012a = list;
        }

        @Override // androidx.media3.ui.c.k
        public final void c(String str) {
        }
    }

    public void setProgressUpdateListener(e eVar) {
    }
}
