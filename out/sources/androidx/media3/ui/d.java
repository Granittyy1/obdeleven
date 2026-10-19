package androidx.media3.ui;

import D2.C0694v;
import E6.c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.compose.foundation.text.input.internal.K;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.d;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.common.collect.ImmutableList;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.garage.j;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p078g1.B;
import p078g1.C2195a;
import p078g1.F;
import p078g1.l;
import p078g1.v;
import p078g1.x;
import p114j1.A;
import p241t7.b;

/* JADX INFO: compiled from: PlayerView.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f19014A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f19015B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f19016C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f19017D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f19018E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f19019F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f19020G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f19021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AspectRatioFrameLayout f19022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f19023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f19024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0191d f19026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f19027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f19028i;
    public final SubtitleView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f19029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f19030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.media3.ui.c f19031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FrameLayout f19032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final FrameLayout f19033o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f19034p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Class<?> f19035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Method f19036r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f19037s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public v f19038t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19039u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.media3.ui.c.l f19040v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f19041w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f19042x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f19043y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f19044z;

    /* JADX INFO: compiled from: PlayerView.java */
    public final class a implements v.c, View.OnClickListener, androidx.media3.ui.c.l, androidx.media3.ui.c.InterfaceC0190c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x.b f19045b = new x.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f19046c;

        public a() {
        }

        @Override // g1.v.c
        public final void A(p102i1.b bVar) {
            SubtitleView subtitleView = d.this.j;
            if (subtitleView != null) {
                subtitleView.setCues(bVar.f36544a);
            }
        }

        @Override // g1.v.c
        public final void M() {
            d dVar = d.this;
            View view = dVar.f19023d;
            if (view != null) {
                view.setVisibility(4);
                if (!dVar.b()) {
                    dVar.c();
                    return;
                }
                ImageView imageView = dVar.f19027h;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        @Override // g1.v.c
        public final void Z(int i10, int i11) {
            if (A.f40996a == 34) {
                d dVar = d.this;
                if ((dVar.f19024e instanceof SurfaceView) && dVar.f19020G) {
                    final C0191d c0191d = dVar.f19026g;
                    c0191d.getClass();
                    Handler handler = dVar.f19034p;
                    final SurfaceView surfaceView = (SurfaceView) dVar.f19024e;
                    final j jVar = new j(1, dVar);
                    handler.post(new Runnable() { // from class: k2.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.C0191d c0191d2 = c0191d;
                            c0191d2.getClass();
                            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
                            if (rootSurfaceControl == null) {
                                return;
                            }
                            SurfaceSyncGroup surfaceSyncGroupA = K.a();
                            c0191d2.f19048a = surfaceSyncGroupA;
                            b.k(surfaceSyncGroupA.add(rootSurfaceControl, new m()));
                            jVar.run();
                            rootSurfaceControl.applyTransactionOnDraw(C0694v.c());
                        }
                    });
                }
            }
        }

        @Override // g1.v.c
        public final void b(F f10) {
            d dVar;
            v vVar;
            if (f10.equals(F.f35228d) || (vVar = (dVar = d.this).f19038t) == null || vVar.C() == 1) {
                return;
            }
            dVar.j();
        }

        @Override // g1.v.c
        public final void b0(B b10) {
            d dVar = d.this;
            v vVar = dVar.f19038t;
            vVar.getClass();
            x xVarR = vVar.L(17) ? vVar.R() : x.f35467a;
            if (xVarR.p()) {
                this.f19046c = null;
            } else {
                boolean zL = vVar.L(30);
                x.b bVar = this.f19045b;
                if (!zL || vVar.D().f35221a.isEmpty()) {
                    Object obj = this.f19046c;
                    if (obj != null) {
                        int iB = xVarR.b(obj);
                        if (iB != -1) {
                            if (vVar.K() == xVarR.f(iB, bVar, false).f35470c) {
                                return;
                            }
                        }
                        this.f19046c = null;
                    }
                } else {
                    this.f19046c = xVarR.f(vVar.m(), bVar, true).f35469b;
                }
            }
            dVar.n(false);
        }

        @Override // g1.v.c
        public final void g(int i10, v.d dVar, v.d dVar2) {
            androidx.media3.ui.c cVar;
            d dVar3 = d.this;
            if (dVar3.d() && dVar3.f19018E && (cVar = dVar3.f19031m) != null) {
                cVar.f();
            }
        }

        @Override // androidx.media3.ui.c.l
        public final void k(int i10) {
            d.this.l();
        }

        @Override // g1.v.c
        public final void o(int i10, boolean z10) {
            d dVar = d.this;
            dVar.k();
            if (!dVar.d() || !dVar.f19018E) {
                dVar.e(false);
                return;
            }
            androidx.media3.ui.c cVar = dVar.f19031m;
            if (cVar != null) {
                cVar.f();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.i();
        }

        @Override // g1.v.c
        public final void q(int i10) {
            d dVar = d.this;
            dVar.k();
            dVar.m();
            if (!dVar.d() || !dVar.f19018E) {
                dVar.e(false);
                return;
            }
            androidx.media3.ui.c cVar = dVar.f19031m;
            if (cVar != null) {
                cVar.f();
            }
        }
    }

    /* JADX INFO: compiled from: PlayerView.java */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: PlayerView.java */
    public interface c {
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PlayerView.java */
    public static final class C0191d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SurfaceSyncGroup f19048a;
    }

    public d(Context context) {
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, null, 0);
        a aVar = new a();
        this.f19021b = aVar;
        this.f19034p = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f19022c = null;
            this.f19023d = null;
            this.f19024e = null;
            this.f19025f = false;
            this.f19026g = null;
            this.f19027h = null;
            this.f19028i = null;
            this.j = null;
            this.f19029k = null;
            this.f19030l = null;
            this.f19031m = null;
            this.f19032n = null;
            this.f19033o = null;
            this.f19035q = null;
            this.f19036r = null;
            this.f19037s = null;
            ImageView imageView = new ImageView(context);
            if (A.f40996a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(2131231006, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(2131231006, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f19022c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.f19023d = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            if (A.f40996a >= 34) {
                surfaceView.setSurfaceLifecycle(2);
            }
            this.f19024e = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(aVar);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.f19024e = null;
        }
        this.f19025f = false;
        this.f19026g = A.f40996a == 34 ? new C0191d() : null;
        this.f19032n = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f19033o = (FrameLayout) findViewById(R.id.exo_overlay);
        this.f19027h = (ImageView) findViewById(R.id.exo_image);
        this.f19042x = 0;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: k2.k
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    d dVar = this.f41535a;
                    dVar.getClass();
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    dVar.f19034p.post(new c(dVar, 4, (Bitmap) objArr[1]));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f19035q = cls;
        this.f19036r = method;
        this.f19037s = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f19028i = imageView2;
        this.f19041w = imageView2 != null ? 1 : 0;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.j = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById = findViewById(R.id.exo_buffering);
        this.f19029k = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.f19044z = 0;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f19030l = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        androidx.media3.ui.c cVar = (androidx.media3.ui.c) findViewById(R.id.exo_controller);
        View viewFindViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (cVar != null) {
            this.f19031m = cVar;
        } else if (viewFindViewById2 != null) {
            androidx.media3.ui.c cVar2 = new androidx.media3.ui.c(context);
            this.f19031m = cVar2;
            cVar2.setId(R.id.exo_controller);
            cVar2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(cVar2, iIndexOfChild);
        } else {
            this.f19031m = null;
        }
        androidx.media3.ui.c cVar3 = this.f19031m;
        this.f19016C = cVar3 != null ? InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS : 0;
        this.f19019F = true;
        this.f19017D = true;
        this.f19018E = true;
        this.f19039u = cVar3 != null;
        if (cVar3 != null) {
            p128k2.j jVar = cVar3.f18958b;
            int i10 = jVar.f41522z;
            if (i10 != 3 && i10 != 2) {
                jVar.f();
                jVar.i(2);
            }
            androidx.media3.ui.c cVar4 = this.f19031m;
            a aVar2 = this.f19021b;
            cVar4.getClass();
            aVar2.getClass();
            cVar4.f18961e.add(aVar2);
        }
        setClickable(true);
        l();
    }

    public static void a(d dVar, Bitmap bitmap) {
        dVar.getClass();
        dVar.setImage(new BitmapDrawable(dVar.getResources(), bitmap));
        v vVar = dVar.f19038t;
        if (vVar != null && vVar.L(30) && vVar.D().a(2)) {
            return;
        }
        ImageView imageView = dVar.f19027h;
        if (imageView != null) {
            imageView.setVisibility(0);
            dVar.o();
        }
        View view = dVar.f19023d;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f19027h;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(v vVar) {
        Class<?> cls = this.f19035q;
        if (cls == null || !cls.isAssignableFrom(vVar.getClass())) {
            return;
        }
        try {
            Method method = this.f19036r;
            method.getClass();
            Object obj = this.f19037s;
            obj.getClass();
            method.invoke(vVar, obj);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean b() {
        v vVar = this.f19038t;
        return vVar != null && this.f19037s != null && vVar.L(30) && vVar.D().a(4);
    }

    public final void c() {
        ImageView imageView = this.f19027h;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean d() {
        v vVar = this.f19038t;
        return vVar != null && vVar.L(16) && this.f19038t.f() && this.f19038t.j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0191d c0191d;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (A.f40996a != 34 || (c0191d = this.f19026g) == null || !this.f19020G || (surfaceSyncGroup = c0191d.f19048a) == null) {
            return;
        }
        surfaceSyncGroup.markSyncReady();
        c0191d.f19048a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        v vVar = this.f19038t;
        if (vVar != null && vVar.L(16) && this.f19038t.f()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        androidx.media3.ui.c cVar = this.f19031m;
        if (z10 && p() && !cVar.g()) {
            e(true);
        } else {
            if ((!p() || !cVar.c(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z10 || !p()) {
                    return false;
                }
                e(true);
                return false;
            }
            e(true);
        }
        return true;
    }

    public final void e(boolean z10) {
        if (!(d() && this.f19018E) && p()) {
            androidx.media3.ui.c cVar = this.f19031m;
            boolean z11 = cVar.g() && cVar.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if (z10 || z11 || zG) {
                h(zG);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.f19028i;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f19041w == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f19022c;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        v vVar = this.f19038t;
        if (vVar == null) {
            return true;
        }
        int iC = vVar.C();
        if (this.f19017D && (!this.f19038t.L(17) || !this.f19038t.R().p())) {
            if (iC == 1 || iC == 4) {
                return true;
            }
            v vVar2 = this.f19038t;
            vVar2.getClass();
            if (!vVar2.j()) {
                return true;
            }
        }
        return false;
    }

    public List<C2195a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f19033o;
        if (frameLayout != null) {
            arrayList.add(new C2195a(frameLayout));
        }
        androidx.media3.ui.c cVar = this.f19031m;
        if (cVar != null) {
            arrayList.add(new C2195a(cVar));
        }
        return ImmutableList.G(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f19032n;
        p241t7.b.m(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f19041w;
    }

    public boolean getControllerAutoShow() {
        return this.f19017D;
    }

    public boolean getControllerHideOnTouch() {
        return this.f19019F;
    }

    public int getControllerShowTimeoutMs() {
        return this.f19016C;
    }

    public Drawable getDefaultArtwork() {
        return this.f19043y;
    }

    public int getImageDisplayMode() {
        return this.f19042x;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f19033o;
    }

    public v getPlayer() {
        return this.f19038t;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f19022c;
        p241t7.b.l(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.j;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f19041w != 0;
    }

    public boolean getUseController() {
        return this.f19039u;
    }

    public View getVideoSurfaceView() {
        return this.f19024e;
    }

    public final void h(boolean z10) {
        if (p()) {
            int i10 = z10 ? 0 : this.f19016C;
            androidx.media3.ui.c cVar = this.f19031m;
            cVar.setShowTimeoutMs(i10);
            p128k2.j jVar = cVar.f18958b;
            androidx.media3.ui.c cVar2 = jVar.f41498a;
            if (!cVar2.h()) {
                cVar2.setVisibility(0);
                cVar2.i();
                ImageView imageView = cVar2.f18971p;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            jVar.k();
        }
    }

    public final void i() {
        if (!p() || this.f19038t == null) {
            return;
        }
        androidx.media3.ui.c cVar = this.f19031m;
        if (!cVar.g()) {
            e(true);
        } else if (this.f19019F) {
            cVar.f();
        }
    }

    public final void j() {
        v vVar = this.f19038t;
        F fO = vVar != null ? vVar.o() : F.f35228d;
        int i10 = fO.f35229a;
        int i11 = fO.f35230b;
        float f10 = this.f19025f ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * fO.f35231c) / i11;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f19022c;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public final void k() {
        boolean z10;
        View view = this.f19029k;
        if (view != null) {
            v vVar = this.f19038t;
            if (vVar == null || vVar.C() != 2) {
                z10 = false;
            } else {
                int i10 = this.f19044z;
                z10 = true;
                if (i10 != 2 && (i10 != 1 || !this.f19038t.j())) {
                    z10 = false;
                }
            }
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void l() {
        androidx.media3.ui.c cVar = this.f19031m;
        if (cVar == null || !this.f19039u) {
            setContentDescription(null);
        } else if (cVar.g()) {
            setContentDescription(this.f19019F ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void m() {
        TextView textView = this.f19030l;
        if (textView != null) {
            CharSequence charSequence = this.f19015B;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                v vVar = this.f19038t;
                if (vVar != null) {
                    vVar.d();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void n(boolean z10) {
        byte[] bArr;
        Drawable drawable;
        v vVar = this.f19038t;
        boolean zF = false;
        boolean z11 = (vVar == null || !vVar.L(30) || vVar.D().f35221a.isEmpty()) ? false : true;
        boolean z12 = this.f19014A;
        ImageView imageView = this.f19028i;
        View view = this.f19023d;
        if (!z12 && (!z11 || z10)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            c();
        }
        if (z11) {
            v vVar2 = this.f19038t;
            boolean z13 = vVar2 != null && vVar2.L(30) && vVar2.D().a(2);
            boolean zB = b();
            if (!z13 && !zB) {
                if (view != null) {
                    view.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.f19027h;
            boolean z14 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zB && !z13 && z14) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z13 && !zB && z14) {
                c();
            }
            if (!z13 && !zB && this.f19041w != 0) {
                p241t7.b.l(imageView);
                if (vVar != null && vVar.L(18) && (bArr = vVar.a0().f35400f) != null) {
                    zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zF || f(this.f19043y)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f19027h;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f19042x == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f19022c) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.f19038t == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.f19039u) {
            return false;
        }
        p241t7.b.l(this.f19031m);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        p241t7.b.k(i10 == 0 || this.f19028i != null);
        if (this.f19041w != i10) {
            this.f19041w = i10;
            n(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f19022c;
        p241t7.b.l(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f19017D = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f19018E = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        p241t7.b.l(this.f19031m);
        this.f19019F = z10;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(androidx.media3.ui.c.InterfaceC0190c interfaceC0190c) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setOnFullScreenModeChangedListener(interfaceC0190c);
    }

    public void setControllerShowTimeoutMs(int i10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        this.f19016C = i10;
        if (cVar.g()) {
            h(g());
        }
    }

    public void setControllerVisibilityListener(b bVar) {
        if (bVar != null) {
            setControllerVisibilityListener((androidx.media3.ui.c.l) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        p241t7.b.k(this.f19030l != null);
        this.f19015B = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f19043y != drawable) {
            this.f19043y = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.f19020G = z10;
    }

    public void setErrorMessageProvider(l<? super PlaybackException> lVar) {
        if (lVar != null) {
            m();
        }
    }

    public void setFullscreenButtonClickListener(c cVar) {
        androidx.media3.ui.c cVar2 = this.f19031m;
        p241t7.b.l(cVar2);
        cVar2.setOnFullScreenModeChangedListener(this.f19021b);
    }

    public void setFullscreenButtonState(boolean z10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.k(z10);
    }

    public void setImageDisplayMode(int i10) {
        p241t7.b.k(this.f19027h != null);
        if (this.f19042x != i10) {
            this.f19042x = i10;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f19014A != z10) {
            this.f19014A = z10;
            n(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00f1  */
    public void setPlayer(v vVar) {
        p241t7.b.k(Looper.myLooper() == Looper.getMainLooper());
        p241t7.b.e(vVar == null || vVar.S() == Looper.getMainLooper());
        v vVar2 = this.f19038t;
        if (vVar2 == vVar) {
            return;
        }
        View view = this.f19024e;
        a aVar = this.f19021b;
        if (vVar2 != null) {
            vVar2.v(aVar);
            if (vVar2.L(27)) {
                if (view instanceof TextureView) {
                    vVar2.n((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    vVar2.N((SurfaceView) view);
                }
            }
            Class<?> cls = this.f19035q;
            if (cls != null && cls.isAssignableFrom(vVar2.getClass())) {
                try {
                    Method method = this.f19036r;
                    method.getClass();
                    method.invoke(vVar2, null);
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        SubtitleView subtitleView = this.j;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f19038t = vVar;
        boolean zP = p();
        androidx.media3.ui.c cVar = this.f19031m;
        if (zP) {
            cVar.setPlayer(vVar);
        }
        k();
        m();
        n(true);
        if (vVar == null) {
            if (cVar != null) {
                cVar.f();
                return;
            }
            return;
        }
        if (vVar.L(27)) {
            if (view instanceof TextureView) {
                vVar.Y((TextureView) view);
            } else if (view instanceof SurfaceView) {
                vVar.s((SurfaceView) view);
            }
            if (vVar.L(30)) {
                B bD = vVar.D();
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    ImmutableList<B.a> immutableList = bD.f35221a;
                    if (i10 >= immutableList.size()) {
                        break;
                    }
                    if (immutableList.get(i10).a() == 2) {
                        B.a aVar2 = immutableList.get(i10);
                        boolean z11 = false;
                        for (int i11 = 0; i11 < aVar2.f35225d.length; i11++) {
                            if (aVar2.b(i11)) {
                                z11 = true;
                                break;
                            }
                        }
                        if (z11) {
                            z10 = true;
                            break;
                        }
                    }
                    i10++;
                }
                if (z10) {
                    j();
                }
            } else {
                j();
            }
        }
        if (subtitleView != null && vVar.L(28)) {
            subtitleView.setCues(vVar.G().f36544a);
        }
        vVar.u(aVar);
        setImageOutput(vVar);
        e(false);
    }

    public void setRepeatToggleModes(int i10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f19022c;
        p241t7.b.l(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f19044z != i10) {
            this.f19044z = i10;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        cVar.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f19023d;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.k((z10 && cVar == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f19039u == z10) {
            return;
        }
        this.f19039u = z10;
        if (p()) {
            cVar.setPlayer(this.f19038t);
        } else if (cVar != null) {
            cVar.f();
            cVar.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f19024e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(androidx.media3.ui.c.l lVar) {
        androidx.media3.ui.c cVar = this.f19031m;
        p241t7.b.l(cVar);
        androidx.media3.ui.c.l lVar2 = this.f19040v;
        if (lVar2 == lVar) {
            return;
        }
        CopyOnWriteArrayList<androidx.media3.ui.c.l> copyOnWriteArrayList = cVar.f18961e;
        if (lVar2 != null) {
            copyOnWriteArrayList.remove(lVar2);
        }
        this.f19040v = lVar;
        if (lVar != null) {
            copyOnWriteArrayList.add(lVar);
            setControllerVisibilityListener((b) null);
        }
    }
}
