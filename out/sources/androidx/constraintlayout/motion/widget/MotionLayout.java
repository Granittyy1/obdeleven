package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.InterfaceC1307w;
import androidx.core.widget.NestedScrollView;
import com.braze.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p077g0.k;
import p126k0.l;
import p126k0.m;
import p126k0.n;
import p126k0.o;
import p126k0.p;
import p126k0.q;
import p126k0.r;
import p126k0.s;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements InterfaceC1307w {

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static boolean f16153U0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f16154A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f16155A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final HashMap<View, n> f16156B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f16157B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f16158C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f16159C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f16160D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f16161D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f16162E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f16163E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f16164F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f16165F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f16166G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public float f16167G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f16168H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final F6.a f16169H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f16170I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f16171I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f16172J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public g f16173J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public h f16174K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public I4.c f16175K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f16176L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final Rect f16177L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public d f16178M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f16179M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f16180N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public TransitionState f16181N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final p113j0.b f16182O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final e f16183O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final c f16184P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f16185P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public p126k0.b f16186Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final RectF f16187Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f16188R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public View f16189R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f16190S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public Matrix f16191S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f16192T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final ArrayList<Integer> f16193T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f16194U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f16195V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f16196W;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f16197p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f16198q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.constraintlayout.motion.widget.a f16199r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ArrayList<o> f16200r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p f16201s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ArrayList<o> f16202s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Interpolator f16203t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CopyOnWriteArrayList<h> f16204t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f16205u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f16206u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16207v;
    public long v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16208w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f16209w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16210x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f16211x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16212y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f16213y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f16214z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f16215z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TransitionState f16216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TransitionState f16217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final TransitionState f16218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final TransitionState f16219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ TransitionState[] f16220f;

        static {
            TransitionState transitionState = new TransitionState("UNDEFINED", 0);
            f16216b = transitionState;
            TransitionState transitionState2 = new TransitionState("SETUP", 1);
            f16217c = transitionState2;
            TransitionState transitionState3 = new TransitionState("MOVING", 2);
            f16218d = transitionState3;
            TransitionState transitionState4 = new TransitionState("FINISHED", 3);
            f16219e = transitionState4;
            f16220f = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public TransitionState() {
            throw null;
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) f16220f.clone();
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f16221b;

        public a(ViewGroup viewGroup) {
            this.f16221b = viewGroup;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f16221b.setNestedScrollingEnabled(true);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f16173J0.a();
        }
    }

    public class c extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f16223a = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f16224b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f16225c;

        public c() {
        }

        @Override // p126k0.p
        public final float a() {
            return MotionLayout.this.f16205u;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = this.f16223a;
            MotionLayout motionLayout = MotionLayout.this;
            if (f11 > 0.0f) {
                float f12 = this.f16225c;
                if (f11 / f12 < f10) {
                    f10 = f11 / f12;
                }
                motionLayout.f16205u = f11 - (f12 * f10);
                return ((f11 * f10) - (((f12 * f10) * f10) / 2.0f)) + this.f16224b;
            }
            float f13 = this.f16225c;
            if ((-f11) / f13 < f10) {
                f10 = (-f11) / f13;
            }
            motionLayout.f16205u = (f13 * f10) + f11;
            return (((f13 * f10) * f10) / 2.0f) + (f11 * f10) + this.f16224b;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f16227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f16228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f16229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Path f16230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Paint f16231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Paint f16232f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Paint f16233g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Paint f16234h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Paint f16235i;
        public final float[] j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f16236k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Rect f16237l = new Rect();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f16238m = 1;

        public d() {
            Paint paint = new Paint();
            this.f16231e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            this.f16232f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f16233g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            this.f16234h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint5 = new Paint();
            this.f16235i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f16229c = new float[100];
            this.f16228b = new int[50];
        }

        public final void a(Canvas canvas, int i10, int i11, n nVar) {
            int width;
            int height;
            int[] iArr = this.f16228b;
            int i12 = 4;
            if (i10 == 4) {
                boolean z10 = false;
                boolean z11 = false;
                for (int i13 = 0; i13 < this.f16236k; i13++) {
                    int i14 = iArr[i13];
                    if (i14 == 1) {
                        z10 = true;
                    }
                    if (i14 == 0) {
                        z11 = true;
                    }
                }
                if (z10) {
                    float[] fArr = this.f16227a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f16233g);
                }
                if (z11) {
                    b(canvas);
                }
            }
            if (i10 == 2) {
                float[] fArr2 = this.f16227a;
                canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.f16233g);
            }
            if (i10 == 3) {
                b(canvas);
            }
            canvas.drawLines(this.f16227a, this.f16231e);
            View view = nVar.f41340b;
            if (view != null) {
                width = view.getWidth();
                height = nVar.f41340b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i15 = 1;
            while (i15 < i11 - 1) {
                if (i10 == i12 && iArr[i15 - 1] == 0) {
                    i15 = i15;
                } else {
                    int i16 = i15 * 2;
                    float[] fArr3 = this.f16229c;
                    float f10 = fArr3[i16];
                    float f11 = fArr3[i16 + 1];
                    this.f16230d.reset();
                    this.f16230d.moveTo(f10, f11 + 10.0f);
                    this.f16230d.lineTo(f10 + 10.0f, f11);
                    this.f16230d.lineTo(f10, f11 - 10.0f);
                    this.f16230d.lineTo(f10 - 10.0f, f11);
                    this.f16230d.close();
                    int i17 = i15 - 1;
                    nVar.f41358u.get(i17);
                    Paint paint = this.f16235i;
                    if (i10 == i12) {
                        int i18 = iArr[i17];
                        if (i18 == 1) {
                            d(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i18 == 0) {
                            c(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else {
                            if (i18 == 2) {
                                e(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f16230d, paint);
                        }
                        canvas.drawPath(this.f16230d, paint);
                    } else {
                        paint = paint;
                        f11 = f11;
                        f10 = f10;
                        i15 = i15;
                    }
                    if (i10 == 2) {
                        d(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i10 == 3) {
                        c(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i10 == 6) {
                        e(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f16230d, paint);
                }
                i15++;
                i12 = 4;
            }
            float[] fArr4 = this.f16227a;
            if (fArr4.length > 1) {
                float f12 = fArr4[0];
                float f13 = fArr4[1];
                Paint paint2 = this.f16232f;
                canvas.drawCircle(f12, f13, 8.0f, paint2);
                float[] fArr5 = this.f16227a;
                canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint2);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.f16227a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            float fMin = Math.min(f10, f12);
            float fMax = Math.max(f11, f13);
            float fMax2 = Math.max(f10, f12);
            float fMax3 = Math.max(f11, f13);
            Paint paint = this.f16233g;
            canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), paint);
        }

        public final void c(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f16227a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fMin = Math.min(f12, f14);
            float fMax = Math.max(f13, f15);
            float fMin2 = f10 - Math.min(f12, f14);
            float fMax2 = Math.max(f13, f15) - f11;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d)) / 100.0f);
            Paint paint = this.f16234h;
            paint.getTextBounds(str, 0, str.length(), this.f16237l);
            Rect rect = this.f16237l;
            canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f11 - 20.0f, paint);
            float fMin3 = Math.min(f12, f14);
            Paint paint2 = this.f16233g;
            canvas.drawLine(f10, f11, fMin3, f11, paint2);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d)) / 100.0f);
            paint.getTextBounds(str2, 0, str2.length(), this.f16237l);
            canvas.drawText(str2, f10 + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f10, f11, f10, Math.max(f13, f15), paint2);
        }

        public final void d(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f16227a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f12 - f14, f13 - f15);
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            float f18 = (((f11 - f13) * f17) + ((f10 - f12) * f16)) / (fHypot * fHypot);
            float f19 = f12 + (f16 * f18);
            float f20 = f13 + (f18 * f17);
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f19, f20);
            float fHypot2 = (float) Math.hypot(f19 - f10, f20 - f11);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            Paint paint = this.f16234h;
            paint.getTextBounds(str, 0, str.length(), this.f16237l);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f16237l.width() / 2), -20.0f, paint);
            canvas.drawLine(f10, f11, f19, f20, this.f16233g);
        }

        public final void e(Canvas canvas, float f10, float f11, int i10, int i11) {
            StringBuilder sb2 = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb2.append(((int) (((double) (((f10 - (i10 / 2)) * 100.0f) / (motionLayout.getWidth() - i10))) + 0.5d)) / 100.0f);
            String string = sb2.toString();
            Paint paint = this.f16234h;
            paint.getTextBounds(string, 0, string.length(), this.f16237l);
            Rect rect = this.f16237l;
            canvas.drawText(string, ((f10 / 2.0f) - (rect.width() / 2)) + 0.0f, f11 - 20.0f, paint);
            float fMin = Math.min(0.0f, 1.0f);
            Paint paint2 = this.f16233g;
            canvas.drawLine(f10, f11, fMin, f11, paint2);
            String str = "" + (((int) (((double) (((f11 - (i11 / 2)) * 100.0f) / (motionLayout.getHeight() - i11))) + 0.5d)) / 100.0f);
            paint.getTextBounds(str, 0, str.length(), this.f16237l);
            canvas.drawText(str, f10 + 5.0f, 0.0f - ((f11 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), paint2);
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f16240a = new androidx.constraintlayout.core.widgets.d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f16241b = new androidx.constraintlayout.core.widgets.d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.constraintlayout.widget.b f16242c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.b f16243d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16244e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16245f;

        public e() {
        }

        public static void c(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
            ConstraintWidget bVar;
            ArrayList<ConstraintWidget> arrayList = dVar.f35715u0;
            HashMap<ConstraintWidget, ConstraintWidget> map = new HashMap<>();
            map.put(dVar, dVar2);
            dVar2.f35715u0.clear();
            dVar2.j(dVar, map);
            for (ConstraintWidget constraintWidget : arrayList) {
                if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
                    bVar = new androidx.constraintlayout.core.widgets.a();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                    bVar = new androidx.constraintlayout.core.widgets.f();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.e) {
                    bVar = new androidx.constraintlayout.core.widgets.e();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.h) {
                    bVar = new androidx.constraintlayout.core.widgets.h();
                } else {
                    bVar = constraintWidget instanceof p089h0.a ? new p089h0.b() : new ConstraintWidget();
                }
                dVar2.f35715u0.add(bVar);
                ConstraintWidget constraintWidget2 = bVar.f15963V;
                if (constraintWidget2 != null) {
                    ((p089h0.c) constraintWidget2).f35715u0.remove(bVar);
                    bVar.G();
                }
                bVar.f15963V = dVar2;
                map.put(constraintWidget, bVar);
            }
            for (ConstraintWidget constraintWidget3 : arrayList) {
                map.get(constraintWidget3).j(constraintWidget3, map);
            }
        }

        public static ConstraintWidget d(androidx.constraintlayout.core.widgets.d dVar, View view) {
            if (dVar.f15983h0 == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> arrayList = dVar.f35715u0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget = arrayList.get(i10);
                if (constraintWidget.f15983h0 == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public final void a() {
            int i10;
            SparseArray sparseArray;
            int[] iArr;
            int i11;
            Interpolator interpolatorLoadInterpolator;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            motionLayout.f16156B.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = motionLayout.getChildAt(i12);
                n nVar = new n(childAt);
                int id = childAt.getId();
                iArr2[i12] = id;
                sparseArray2.put(id, nVar);
                motionLayout.f16156B.put(childAt, nVar);
            }
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = motionLayout.getChildAt(i13);
                n nVar2 = motionLayout.f16156B.get(childAt2);
                if (nVar2 == null) {
                    i10 = childCount;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i11 = i13;
                } else {
                    if (this.f16242c != null) {
                        ConstraintWidget constraintWidgetD = d(this.f16240a, childAt2);
                        if (constraintWidgetD != null) {
                            Rect rectQ = MotionLayout.q(motionLayout, constraintWidgetD);
                            androidx.constraintlayout.widget.b bVar = this.f16242c;
                            int width = motionLayout.getWidth();
                            int height = motionLayout.getHeight();
                            sparseArray = sparseArray2;
                            int i14 = bVar.f16485d;
                            iArr = iArr2;
                            if (i14 != 0) {
                                n.f(rectQ, nVar2.f41339a, i14, width, height);
                            }
                            q qVar = nVar2.f41344f;
                            qVar.f41370d = 0.0f;
                            qVar.f41371e = 0.0f;
                            nVar2.e(qVar);
                            i10 = childCount;
                            i11 = i13;
                            qVar.d(rectQ.left, rectQ.top, rectQ.width(), rectQ.height());
                            androidx.constraintlayout.widget.b.a aVarH = bVar.h(nVar2.f41341c);
                            qVar.a(aVarH);
                            androidx.constraintlayout.widget.b.c cVar = aVarH.f16492d;
                            nVar2.f41349l = cVar.f16583g;
                            nVar2.f41346h.c(rectQ, bVar, i14, nVar2.f41341c);
                            nVar2.f41333C = aVarH.f16494f.f16603i;
                            nVar2.f41335E = cVar.j;
                            nVar2.f41336F = cVar.f16585i;
                            Context context = nVar2.f41340b.getContext();
                            int i15 = cVar.f16587l;
                            String str = cVar.f16586k;
                            int i16 = cVar.f16588m;
                            if (i15 == -2) {
                                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i16);
                            } else if (i15 == -1) {
                                interpolatorLoadInterpolator = new m(p077g0.c.c(str));
                            } else if (i15 == 0) {
                                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                            } else if (i15 == 1) {
                                interpolatorLoadInterpolator = new AccelerateInterpolator();
                            } else if (i15 == 2) {
                                interpolatorLoadInterpolator = new DecelerateInterpolator();
                            } else if (i15 != 4) {
                                interpolatorLoadInterpolator = i15 != 5 ? null : new OvershootInterpolator();
                            } else {
                                interpolatorLoadInterpolator = new BounceInterpolator();
                            }
                            nVar2.f41337G = interpolatorLoadInterpolator;
                        } else {
                            i10 = childCount;
                            sparseArray = sparseArray2;
                            iArr = iArr2;
                            i11 = i13;
                            if (motionLayout.f16176L != 0) {
                                Log.e("MotionLayout", p126k0.a.b() + "no widget for  " + p126k0.a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    } else {
                        i10 = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i11 = i13;
                    }
                    if (this.f16243d != null) {
                        ConstraintWidget constraintWidgetD2 = d(this.f16241b, childAt2);
                        if (constraintWidgetD2 != null) {
                            Rect rectQ2 = MotionLayout.q(motionLayout, constraintWidgetD2);
                            androidx.constraintlayout.widget.b bVar2 = this.f16243d;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            int i17 = bVar2.f16485d;
                            if (i17 != 0) {
                                n.f(rectQ2, nVar2.f41339a, i17, width2, height2);
                                rectQ2 = nVar2.f41339a;
                            }
                            q qVar2 = nVar2.f41345g;
                            qVar2.f41370d = 1.0f;
                            qVar2.f41371e = 1.0f;
                            nVar2.e(qVar2);
                            qVar2.d(rectQ2.left, rectQ2.top, rectQ2.width(), rectQ2.height());
                            qVar2.a(bVar2.h(nVar2.f41341c));
                            nVar2.f41347i.c(rectQ2, bVar2, i17, nVar2.f41341c);
                        } else if (motionLayout.f16176L != 0) {
                            Log.e("MotionLayout", p126k0.a.b() + "no widget for  " + p126k0.a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i13 = i11 + 1;
                sparseArray2 = sparseArray;
                iArr2 = iArr;
                childCount = i10;
            }
            SparseArray sparseArray3 = sparseArray2;
            int[] iArr3 = iArr2;
            int i18 = childCount;
            int i19 = 0;
            while (i19 < i18) {
                SparseArray sparseArray4 = sparseArray3;
                n nVar3 = (n) sparseArray4.get(iArr3[i19]);
                int i20 = nVar3.f41344f.f41377l;
                if (i20 != -1) {
                    n nVar4 = (n) sparseArray4.get(i20);
                    nVar3.f41344f.f(nVar4, nVar4.f41344f);
                    nVar3.f41345g.f(nVar4, nVar4.f41345g);
                }
                i19++;
                sparseArray3 = sparseArray4;
            }
        }

        public final void b(int i10, int i11) {
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.f16208w == motionLayout.getStartState()) {
                androidx.constraintlayout.core.widgets.d dVar = this.f16241b;
                androidx.constraintlayout.widget.b bVar = this.f16243d;
                motionLayout.i(dVar, optimizationLevel, (bVar == null || bVar.f16485d == 0) ? i10 : i11, (bVar == null || bVar.f16485d == 0) ? i11 : i10);
                androidx.constraintlayout.widget.b bVar2 = this.f16242c;
                if (bVar2 != null) {
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f16240a;
                    int i12 = bVar2.f16485d;
                    int i13 = i12 == 0 ? i10 : i11;
                    if (i12 == 0) {
                        i10 = i11;
                    }
                    motionLayout.i(dVar2, optimizationLevel, i13, i10);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.b bVar3 = this.f16242c;
            if (bVar3 != null) {
                androidx.constraintlayout.core.widgets.d dVar3 = this.f16240a;
                int i14 = bVar3.f16485d;
                motionLayout.i(dVar3, optimizationLevel, i14 == 0 ? i10 : i11, i14 == 0 ? i11 : i10);
            }
            androidx.constraintlayout.core.widgets.d dVar4 = this.f16241b;
            androidx.constraintlayout.widget.b bVar4 = this.f16243d;
            int i15 = (bVar4 == null || bVar4.f16485d == 0) ? i10 : i11;
            if (bVar4 == null || bVar4.f16485d == 0) {
                i10 = i11;
            }
            motionLayout.i(dVar4, optimizationLevel, i15, i10);
        }

        public final void e(androidx.constraintlayout.widget.b bVar, androidx.constraintlayout.widget.b bVar2) {
            this.f16242c = bVar;
            this.f16243d = bVar2;
            this.f16240a = new androidx.constraintlayout.core.widgets.d();
            androidx.constraintlayout.core.widgets.d dVar = new androidx.constraintlayout.core.widgets.d();
            this.f16241b = dVar;
            androidx.constraintlayout.core.widgets.d dVar2 = this.f16240a;
            boolean z10 = MotionLayout.f16153U0;
            MotionLayout motionLayout = MotionLayout.this;
            androidx.constraintlayout.core.widgets.d dVar3 = motionLayout.f16383d;
            p101i0.b.InterfaceC0381b interfaceC0381b = dVar3.f16091y0;
            dVar2.f16091y0 = interfaceC0381b;
            dVar2.f16089w0.f36480f = interfaceC0381b;
            p101i0.b.InterfaceC0381b interfaceC0381b2 = dVar3.f16091y0;
            dVar.f16091y0 = interfaceC0381b2;
            dVar.f16089w0.f36480f = interfaceC0381b2;
            dVar2.f35715u0.clear();
            this.f16241b.f35715u0.clear();
            c(motionLayout.f16383d, this.f16240a);
            c(motionLayout.f16383d, this.f16241b);
            if (motionLayout.f16164F > 0.5d) {
                if (bVar != null) {
                    g(this.f16240a, bVar);
                }
                g(this.f16241b, bVar2);
            } else {
                g(this.f16241b, bVar2);
                if (bVar != null) {
                    g(this.f16240a, bVar);
                }
            }
            this.f16240a.f16092z0 = motionLayout.f();
            androidx.constraintlayout.core.widgets.d dVar4 = this.f16240a;
            dVar4.v0.c(dVar4);
            this.f16241b.f16092z0 = motionLayout.f();
            androidx.constraintlayout.core.widgets.d dVar5 = this.f16241b;
            dVar5.v0.c(dVar5);
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                int i10 = layoutParams.width;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16014c;
                if (i10 == -2) {
                    this.f16240a.Q(dimensionBehaviour);
                    this.f16241b.Q(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    this.f16240a.R(dimensionBehaviour);
                    this.f16241b.R(dimensionBehaviour);
                }
            }
        }

        public final void f() {
            HashMap<View, n> map;
            MotionLayout motionLayout = MotionLayout.this;
            int i10 = motionLayout.f16212y;
            int i11 = motionLayout.f16214z;
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            motionLayout.f16163E0 = mode;
            motionLayout.f16165F0 = mode2;
            b(i10, i11);
            int i12 = 0;
            if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i10, i11);
                motionLayout.f16155A0 = this.f16240a.u();
                motionLayout.f16157B0 = this.f16240a.o();
                motionLayout.f16159C0 = this.f16241b.u();
                int iO = this.f16241b.o();
                motionLayout.f16161D0 = iO;
                motionLayout.f16215z0 = (motionLayout.f16155A0 == motionLayout.f16159C0 && motionLayout.f16157B0 == iO) ? false : true;
            }
            int i13 = motionLayout.f16155A0;
            int i14 = motionLayout.f16157B0;
            int i15 = motionLayout.f16163E0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                i13 = (int) ((motionLayout.f16167G0 * (motionLayout.f16159C0 - i13)) + i13);
            }
            int i16 = i13;
            int i17 = motionLayout.f16165F0;
            int i18 = (i17 == Integer.MIN_VALUE || i17 == 0) ? (int) ((motionLayout.f16167G0 * (motionLayout.f16161D0 - i14)) + i14) : i14;
            androidx.constraintlayout.core.widgets.d dVar = this.f16240a;
            motionLayout.h(i10, i11, i16, i18, dVar.f16081I0 || this.f16241b.f16081I0, dVar.f16082J0 || this.f16241b.f16082J0);
            int childCount = motionLayout.getChildCount();
            motionLayout.f16183O0.a();
            motionLayout.f16172J = true;
            SparseArray sparseArray = new SparseArray();
            int i19 = 0;
            while (true) {
                map = motionLayout.f16156B;
                if (i19 >= childCount) {
                    break;
                }
                View childAt = motionLayout.getChildAt(i19);
                sparseArray.put(childAt.getId(), map.get(childAt));
                i19++;
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            androidx.constraintlayout.motion.widget.a.b bVar = motionLayout.f16199r.f16256c;
            int i20 = bVar != null ? bVar.f16287p : -1;
            if (i20 != -1) {
                for (int i21 = 0; i21 < childCount; i21++) {
                    n nVar = map.get(motionLayout.getChildAt(i21));
                    if (nVar != null) {
                        nVar.f41332B = i20;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[map.size()];
            int i22 = 0;
            for (int i23 = 0; i23 < childCount; i23++) {
                n nVar2 = map.get(motionLayout.getChildAt(i23));
                int i24 = nVar2.f41344f.f41377l;
                if (i24 != -1) {
                    sparseBooleanArray.put(i24, true);
                    iArr[i22] = nVar2.f41344f.f41377l;
                    i22++;
                }
            }
            for (int i25 = 0; i25 < i22; i25++) {
                n nVar3 = map.get(motionLayout.findViewById(iArr[i25]));
                if (nVar3 != null) {
                    motionLayout.f16199r.e(nVar3);
                    nVar3.g(motionLayout.getNanoTime(), width, height);
                }
            }
            for (int i26 = 0; i26 < childCount; i26++) {
                View childAt2 = motionLayout.getChildAt(i26);
                n nVar4 = map.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && nVar4 != null) {
                    motionLayout.f16199r.e(nVar4);
                    nVar4.g(motionLayout.getNanoTime(), width, height);
                }
            }
            androidx.constraintlayout.motion.widget.a.b bVar2 = motionLayout.f16199r.f16256c;
            float f10 = bVar2 != null ? bVar2.f16281i : 0.0f;
            if (f10 != 0.0f) {
                boolean z10 = ((double) f10) < 0.0d;
                float fAbs = Math.abs(f10);
                float fMax = -3.4028235E38f;
                float fMin = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                for (int i27 = 0; i27 < childCount; i27++) {
                    n nVar5 = map.get(motionLayout.getChildAt(i27));
                    if (!Float.isNaN(nVar5.f41349l)) {
                        for (int i28 = 0; i28 < childCount; i28++) {
                            n nVar6 = map.get(motionLayout.getChildAt(i28));
                            if (!Float.isNaN(nVar6.f41349l)) {
                                fMin = Math.min(fMin, nVar6.f41349l);
                                fMax = Math.max(fMax, nVar6.f41349l);
                            }
                        }
                        while (i12 < childCount) {
                            n nVar7 = map.get(motionLayout.getChildAt(i12));
                            if (!Float.isNaN(nVar7.f41349l)) {
                                nVar7.f41351n = 1.0f / (1.0f - fAbs);
                                if (z10) {
                                    nVar7.f41350m = fAbs - (((fMax - nVar7.f41349l) / (fMax - fMin)) * fAbs);
                                } else {
                                    nVar7.f41350m = fAbs - (((nVar7.f41349l - fMin) * fAbs) / (fMax - fMin));
                                }
                            }
                            i12++;
                        }
                        return;
                    }
                    q qVar = nVar5.f41345g;
                    float f11 = qVar.f41372f;
                    float f12 = qVar.f41373g;
                    float f13 = z10 ? f12 - f11 : f12 + f11;
                    fMin2 = Math.min(fMin2, f13);
                    fMax2 = Math.max(fMax2, f13);
                }
                while (i12 < childCount) {
                    n nVar8 = map.get(motionLayout.getChildAt(i12));
                    q qVar2 = nVar8.f41345g;
                    float f14 = qVar2.f41372f;
                    float f15 = qVar2.f41373g;
                    float f16 = z10 ? f15 - f14 : f15 + f14;
                    nVar8.f41351n = 1.0f / (1.0f - fAbs);
                    nVar8.f41350m = fAbs - (((f16 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i12++;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.b bVar) {
            androidx.constraintlayout.widget.b.a aVar;
            androidx.constraintlayout.widget.b.a aVar2;
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            androidx.constraintlayout.widget.c.a aVar3 = new androidx.constraintlayout.widget.c.a();
            sparseArray.clear();
            sparseArray.put(0, dVar);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), dVar);
            if (bVar != null && bVar.f16485d != 0) {
                androidx.constraintlayout.core.widgets.d dVar2 = this.f16241b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
                boolean z10 = MotionLayout.f16153U0;
                motionLayout.i(dVar2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            for (ConstraintWidget constraintWidget : dVar.f35715u0) {
                constraintWidget.f15986j0 = true;
                sparseArray.put(constraintWidget.f15983h0.getId(), constraintWidget);
            }
            for (ConstraintWidget constraintWidget2 : dVar.f35715u0) {
                View view = constraintWidget2.f15983h0;
                int id = view.getId();
                HashMap<Integer, androidx.constraintlayout.widget.b.a> map = bVar.f16488g;
                if (map.containsKey(Integer.valueOf(id)) && (aVar2 = map.get(Integer.valueOf(id))) != null) {
                    aVar2.a(aVar3);
                }
                constraintWidget2.S(bVar.h(view.getId()).f16493e.f16539c);
                constraintWidget2.P(bVar.h(view.getId()).f16493e.f16541d);
                if (view instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar4 = (androidx.constraintlayout.widget.a) view;
                    int id2 = aVar4.getId();
                    HashMap<Integer, androidx.constraintlayout.widget.b.a> map2 = bVar.f16488g;
                    if (map2.containsKey(Integer.valueOf(id2)) && (aVar = map2.get(Integer.valueOf(id2))) != null && (constraintWidget2 instanceof p089h0.b)) {
                        aVar4.i(aVar, (p089h0.b) constraintWidget2, aVar3, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).k();
                    }
                }
                aVar3.resolveLayoutDirection(motionLayout.getLayoutDirection());
                boolean z11 = MotionLayout.f16153U0;
                MotionLayout.this.b(false, view, constraintWidget2, aVar3, sparseArray);
                if (bVar.h(view.getId()).f16491c.f16591c == 1) {
                    constraintWidget2.f15985i0 = view.getVisibility();
                } else {
                    constraintWidget2.f15985i0 = bVar.h(view.getId()).f16491c.f16590b;
                }
            }
            for (ConstraintWidget constraintWidget3 : dVar.f35715u0) {
                if (constraintWidget3 instanceof i) {
                    androidx.constraintlayout.widget.a aVar5 = (androidx.constraintlayout.widget.a) constraintWidget3.f15983h0;
                    p089h0.a aVar6 = (p089h0.a) constraintWidget3;
                    aVar5.getClass();
                    aVar6.a();
                    for (int i10 = 0; i10 < aVar5.f16473c; i10++) {
                        aVar6.b(sparseArray.get(aVar5.f16472b[i10]));
                    }
                    i iVar = (i) aVar6;
                    for (int i11 = 0; i11 < iVar.v0; i11++) {
                        ConstraintWidget constraintWidget4 = iVar.f35714u0[i11];
                        if (constraintWidget4 != null) {
                            constraintWidget4.f15948G = true;
                        }
                    }
                }
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f16247b = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public VelocityTracker f16248a;
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f16249a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f16250b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16251c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16252d = -1;

        public g() {
        }

        public final void a() {
            int i10 = this.f16251c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i10 != -1 || this.f16252d != -1) {
                if (i10 == -1) {
                    motionLayout.E(this.f16252d);
                } else {
                    int i11 = this.f16252d;
                    if (i11 == -1) {
                        motionLayout.B(i10);
                    } else {
                        motionLayout.C(i10, i11);
                    }
                }
                motionLayout.setState(TransitionState.f16217c);
            }
            if (Float.isNaN(this.f16250b)) {
                if (Float.isNaN(this.f16249a)) {
                    return;
                }
                motionLayout.setProgress(this.f16249a);
                return;
            }
            float f10 = this.f16249a;
            float f11 = this.f16250b;
            if (motionLayout.isAttachedToWindow()) {
                motionLayout.setProgress(f10);
                motionLayout.setState(TransitionState.f16218d);
                motionLayout.f16205u = f11;
                if (f11 != 0.0f) {
                    motionLayout.r(f11 > 0.0f ? 1.0f : 0.0f);
                } else if (f10 != 0.0f && f10 != 1.0f) {
                    motionLayout.r(f10 > 0.5f ? 1.0f : 0.0f);
                }
            } else {
                if (motionLayout.f16173J0 == null) {
                    motionLayout.f16173J0 = motionLayout.new g();
                }
                g gVar = motionLayout.f16173J0;
                gVar.f16249a = f10;
                gVar.f16250b = f11;
            }
            this.f16249a = Float.NaN;
            this.f16250b = Float.NaN;
            this.f16251c = -1;
            this.f16252d = -1;
        }
    }

    public interface h {
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.a aVar;
        super(context, attributeSet);
        this.f16203t = null;
        this.f16205u = 0.0f;
        this.f16207v = -1;
        this.f16208w = -1;
        this.f16210x = -1;
        this.f16212y = 0;
        this.f16214z = 0;
        this.f16154A = true;
        this.f16156B = new HashMap<>();
        this.f16158C = 0L;
        this.f16160D = 1.0f;
        this.f16162E = 0.0f;
        this.f16164F = 0.0f;
        this.f16168H = 0.0f;
        this.f16172J = false;
        this.f16176L = 0;
        this.f16180N = false;
        this.f16182O = new p113j0.b();
        this.f16184P = new c();
        this.f16192T = false;
        this.f16198q0 = false;
        this.f16200r0 = null;
        this.f16202s0 = null;
        this.f16204t0 = null;
        this.f16206u0 = 0;
        this.v0 = -1L;
        this.f16209w0 = 0.0f;
        this.f16211x0 = 0;
        this.f16213y0 = 0.0f;
        this.f16215z0 = false;
        this.f16169H0 = new F6.a(4);
        this.f16171I0 = false;
        this.f16175K0 = null;
        new HashMap();
        this.f16177L0 = new Rect();
        this.f16179M0 = false;
        this.f16181N0 = TransitionState.f16216b;
        this.f16183O0 = new e();
        this.f16185P0 = false;
        this.f16187Q0 = new RectF();
        this.f16189R0 = null;
        this.f16191S0 = null;
        this.f16193T0 = new ArrayList<>();
        f16153U0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p139l0.d.f44135n);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 2) {
                    this.f16199r = new androidx.constraintlayout.motion.widget.a(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f16208w = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f16168H = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f16172J = true;
                } else if (index == 0) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                } else if (index == 5) {
                    if (this.f16176L == 0) {
                        this.f16176L = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f16176L = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f16199r == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.f16199r = null;
            }
        }
        if (this.f16176L != 0) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.f16199r;
            if (aVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iG = aVar2.g();
                androidx.constraintlayout.motion.widget.a aVar3 = this.f16199r;
                androidx.constraintlayout.widget.b bVarB = aVar3.b(aVar3.g());
                p126k0.a.c(getContext(), iG);
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (bVarB.i(childAt.getId()) == null) {
                        p126k0.a.d(childAt);
                    }
                }
                Integer[] numArr = (Integer[]) bVarB.f16488g.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i12 = 0; i12 < length; i12++) {
                    iArr[i12] = numArr[i12].intValue();
                }
                for (int i13 = 0; i13 < length; i13++) {
                    int i14 = iArr[i13];
                    p126k0.a.c(getContext(), i14);
                    findViewById(iArr[i13]);
                    int i15 = bVarB.h(i14).f16493e.f16541d;
                    int i16 = bVarB.h(i14).f16493e.f16539c;
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (androidx.constraintlayout.motion.widget.a.b bVar : this.f16199r.f16257d) {
                    androidx.constraintlayout.motion.widget.a.b bVar2 = this.f16199r.f16256c;
                    if (bVar.f16276d == bVar.f16275c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i17 = bVar.f16276d;
                    int i18 = bVar.f16275c;
                    String strC = p126k0.a.c(getContext(), i17);
                    String strC2 = p126k0.a.c(getContext(), i18);
                    if (sparseIntArray.get(i17) == i18) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strC + "->" + strC2);
                    }
                    if (sparseIntArray2.get(i18) == i17) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strC + "->" + strC2);
                    }
                    sparseIntArray.put(i17, i18);
                    sparseIntArray2.put(i18, i17);
                    if (this.f16199r.b(i17) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + strC);
                    }
                    if (this.f16199r.b(i18) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + strC);
                    }
                }
            }
        }
        if (this.f16208w != -1 || (aVar = this.f16199r) == null) {
            return;
        }
        this.f16208w = aVar.g();
        this.f16207v = this.f16199r.g();
        androidx.constraintlayout.motion.widget.a.b bVar3 = this.f16199r.f16256c;
        this.f16210x = bVar3 != null ? bVar3.f16275c : -1;
    }

    public static Rect q(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        motionLayout.getClass();
        int iW = constraintWidget.w();
        Rect rect = motionLayout.f16177L0;
        rect.top = iW;
        rect.left = constraintWidget.v();
        rect.right = constraintWidget.u() + rect.left;
        rect.bottom = constraintWidget.o() + rect.top;
        return rect;
    }

    public final void A() {
        this.f16183O0.f();
        invalidate();
    }

    public final void B(int i10) {
        setState(TransitionState.f16217c);
        this.f16208w = i10;
        this.f16207v = -1;
        this.f16210x = -1;
        p139l0.a aVar = this.f16390l;
        if (aVar == null) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.f16199r;
            if (aVar2 != null) {
                aVar2.b(i10).b(this);
                return;
            }
            return;
        }
        float f10 = -1;
        int i11 = aVar.f44109b;
        SparseArray<p139l0.a.C0503a> sparseArray = aVar.f44111d;
        int i12 = 0;
        ConstraintLayout constraintLayout = aVar.f44108a;
        if (i11 != i10) {
            aVar.f44109b = i10;
            p139l0.a.C0503a c0503a = sparseArray.get(i10);
            while (true) {
                ArrayList<l0.a.b> arrayList = c0503a.f44114b;
                if (i12 >= arrayList.size()) {
                    i12 = -1;
                    break;
                } else if (arrayList.get(i12).a(f10, f10)) {
                    break;
                } else {
                    i12++;
                }
            }
            ArrayList<l0.a.b> arrayList2 = c0503a.f44114b;
            androidx.constraintlayout.widget.b bVar = i12 == -1 ? c0503a.f44116d : arrayList2.get(i12).f44122f;
            if (i12 != -1) {
                int i13 = arrayList2.get(i12).f44121e;
            }
            if (bVar == null) {
                return;
            }
            aVar.f44110c = i12;
            bVar.b(constraintLayout);
            return;
        }
        p139l0.a.C0503a c0503aValueAt = i10 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i11);
        int i14 = aVar.f44110c;
        if (i14 == -1 || !c0503aValueAt.f44114b.get(i14).a(f10, f10)) {
            while (true) {
                ArrayList<l0.a.b> arrayList3 = c0503aValueAt.f44114b;
                if (i12 >= arrayList3.size()) {
                    i12 = -1;
                    break;
                } else if (arrayList3.get(i12).a(f10, f10)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (aVar.f44110c == i12) {
                return;
            }
            ArrayList<l0.a.b> arrayList4 = c0503aValueAt.f44114b;
            androidx.constraintlayout.widget.b bVar2 = i12 == -1 ? null : arrayList4.get(i12).f44122f;
            if (i12 != -1) {
                int i15 = arrayList4.get(i12).f44121e;
            }
            if (bVar2 == null) {
                return;
            }
            aVar.f44110c = i12;
            bVar2.b(constraintLayout);
        }
    }

    public final void C(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f16173J0 == null) {
                this.f16173J0 = new g();
            }
            g gVar = this.f16173J0;
            gVar.f16251c = i10;
            gVar.f16252d = i11;
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar != null) {
            this.f16207v = i10;
            this.f16210x = i11;
            aVar.m(i10, i11);
            this.f16183O0.e(this.f16199r.b(i10), this.f16199r.b(i11));
            A();
            this.f16164F = 0.0f;
            r(0.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x010f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    /* JADX WARN: Code duplicated, block: B:83:0x012d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0132  */
    public final void D(float f10, float f11, int i10) {
        int i11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i12;
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.b bVar3;
        androidx.constraintlayout.motion.widget.b bVar4;
        androidx.constraintlayout.motion.widget.b bVar5;
        androidx.constraintlayout.motion.widget.a.b bVar6;
        androidx.constraintlayout.motion.widget.b bVar7;
        androidx.constraintlayout.motion.widget.b bVar8;
        androidx.constraintlayout.motion.widget.a.b bVar9;
        float f16;
        androidx.constraintlayout.motion.widget.b bVar10;
        float f17 = f10;
        if (this.f16199r == null || this.f16164F == f17) {
            return;
        }
        this.f16180N = true;
        this.f16158C = getNanoTime();
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        androidx.constraintlayout.motion.widget.a.b bVar11 = aVar.f16256c;
        float f18 = (bVar11 != null ? bVar11.f16280h : aVar.j) / 1000.0f;
        this.f16160D = f18;
        this.f16168H = f17;
        this.f16172J = true;
        p113j0.b bVar12 = this.f16182O;
        float f19 = 0.0f;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            if (i10 != 1 || i10 == 7) {
                f17 = 0.0f;
            } else if (i10 == 2 || i10 == 6) {
                f17 = 1.0f;
            }
            if (bVar11 != null || (bVar8 = bVar11.f16283l) == null) {
                i11 = 0;
            } else {
                i11 = bVar8.f16298D;
            }
            if (i11 == 0) {
                float f20 = this.f16164F;
                float f21 = aVar.f();
                bVar6 = this.f16199r.f16256c;
                if (bVar6 != null && (bVar7 = bVar6.f16283l) != null) {
                    f19 = bVar7.f16316s;
                }
                this.f16182O.b(f20, f17, f11, f18, f21, f19);
            } else {
                float f22 = this.f16164F;
                if (bVar11 != null || (bVar5 = bVar11.f16283l) == null) {
                    f12 = 0.0f;
                } else {
                    f12 = bVar5.f16323z;
                }
                if (bVar11 != null || (bVar4 = bVar11.f16283l) == null) {
                    f13 = 0.0f;
                } else {
                    f13 = bVar4.f16295A;
                }
                if (bVar11 != null || (bVar3 = bVar11.f16283l) == null) {
                    f14 = 0.0f;
                } else {
                    f14 = bVar3.f16322y;
                }
                if (bVar11 != null || (bVar2 = bVar11.f16283l) == null) {
                    f15 = 0.0f;
                } else {
                    f15 = bVar2.f16296B;
                }
                if (bVar11 != null || (bVar = bVar11.f16283l) == null) {
                    i12 = 0;
                } else {
                    i12 = bVar.f16297C;
                }
                if (bVar12.f40983b == null) {
                    k kVar = new k();
                    kVar.f35148a = 0.5d;
                    kVar.f35156i = 0;
                    bVar12.f40983b = kVar;
                }
                k kVar2 = bVar12.f40983b;
                bVar12.f40984c = kVar2;
                kVar2.f35150c = f17;
                kVar2.f35148a = f14;
                kVar2.f35152e = f22;
                kVar2.f35149b = f13;
                kVar2.f35154g = f12;
                kVar2.f35155h = f15;
                kVar2.f35156i = i12;
                kVar2.f35151d = 0.0f;
            }
            int i13 = this.f16208w;
            this.f16168H = f17;
            this.f16208w = i13;
            this.f16201s = bVar12;
        } else {
            c cVar = this.f16184P;
            if (i10 == 4) {
                float f23 = this.f16164F;
                float f24 = aVar.f();
                cVar.f16223a = f11;
                cVar.f16224b = f23;
                cVar.f16225c = f24;
                this.f16201s = cVar;
            } else if (i10 == 5) {
                float f25 = this.f16164F;
                float f26 = aVar.f();
                if (f11 > 0.0f) {
                    float f27 = f11 / f26;
                    if (((f11 * f27) - (((f26 * f27) * f27) / 2.0f)) + f25 > 1.0f) {
                        float f28 = this.f16164F;
                        float f29 = this.f16199r.f();
                        cVar.f16223a = f11;
                        cVar.f16224b = f28;
                        cVar.f16225c = f29;
                        this.f16201s = cVar;
                    } else {
                        float f30 = this.f16164F;
                        float f31 = this.f16160D;
                        float f32 = this.f16199r.f();
                        bVar9 = this.f16199r.f16256c;
                        if (bVar9 != null || (bVar10 = bVar9.f16283l) == null) {
                            f16 = 0.0f;
                        } else {
                            f16 = bVar10.f16316s;
                        }
                        this.f16182O.b(f30, f10, f11, f31, f32, f16);
                        this.f16205u = 0.0f;
                        int i14 = this.f16208w;
                        this.f16168H = f17;
                        this.f16208w = i14;
                        this.f16201s = bVar12;
                    }
                } else {
                    float f33 = (-f11) / f26;
                    if ((((f26 * f33) * f33) / 2.0f) + (f11 * f33) + f25 < 0.0f) {
                        float f210 = this.f16164F;
                        float f211 = this.f16199r.f();
                        cVar.f16223a = f11;
                        cVar.f16224b = f210;
                        cVar.f16225c = f211;
                        this.f16201s = cVar;
                    } else {
                        float f34 = this.f16164F;
                        float f35 = this.f16160D;
                        float f36 = this.f16199r.f();
                        bVar9 = this.f16199r.f16256c;
                        if (bVar9 != null) {
                            f16 = 0.0f;
                        } else {
                            f16 = 0.0f;
                        }
                        this.f16182O.b(f34, f10, f11, f35, f36, f16);
                        this.f16205u = 0.0f;
                        int i15 = this.f16208w;
                        this.f16168H = f17;
                        this.f16208w = i15;
                        this.f16201s = bVar12;
                    }
                }
            } else if (i10 == 6 || i10 == 7) {
                if (i10 != 1) {
                    f17 = 0.0f;
                } else {
                    f17 = 0.0f;
                }
                if (bVar11 != null) {
                    i11 = 0;
                } else {
                    i11 = 0;
                }
                if (i11 == 0) {
                    float f212 = this.f16164F;
                    float f213 = aVar.f();
                    bVar6 = this.f16199r.f16256c;
                    if (bVar6 != null) {
                        f19 = bVar7.f16316s;
                    }
                    this.f16182O.b(f212, f17, f11, f18, f213, f19);
                } else {
                    float f214 = this.f16164F;
                    if (bVar11 != null) {
                        f12 = 0.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    if (bVar11 != null) {
                        f13 = 0.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    if (bVar11 != null) {
                        f14 = 0.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    if (bVar11 != null) {
                        f15 = 0.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    if (bVar11 != null) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                    }
                    if (bVar12.f40983b == null) {
                        k kVar3 = new k();
                        kVar3.f35148a = 0.5d;
                        kVar3.f35156i = 0;
                        bVar12.f40983b = kVar3;
                    }
                    k kVar4 = bVar12.f40983b;
                    bVar12.f40984c = kVar4;
                    kVar4.f35150c = f17;
                    kVar4.f35148a = f14;
                    kVar4.f35152e = f214;
                    kVar4.f35149b = f13;
                    kVar4.f35154g = f12;
                    kVar4.f35155h = f15;
                    kVar4.f35156i = i12;
                    kVar4.f35151d = 0.0f;
                }
                int i16 = this.f16208w;
                this.f16168H = f17;
                this.f16208w = i16;
                this.f16201s = bVar12;
            }
        }
        this.f16170I = false;
        this.f16158C = getNanoTime();
        invalidate();
    }

    public final void E(int i10) {
        p139l0.f fVar;
        if (!isAttachedToWindow()) {
            if (this.f16173J0 == null) {
                this.f16173J0 = new g();
            }
            this.f16173J0.f16252d = i10;
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar != null && (fVar = aVar.f16255b) != null) {
            int i11 = this.f16208w;
            float f10 = -1;
            l0.f.a aVar2 = fVar.f44149b.get(i10);
            if (aVar2 != null) {
                ArrayList<l0.f.b> arrayList = aVar2.f44151b;
                int i12 = aVar2.f44152c;
                if (f10 != -1.0f && f10 != -1.0f) {
                    Iterator<l0.f.b> it = arrayList.iterator();
                    l0.f.b bVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (bVar != null) {
                                i11 = bVar.f44157e;
                                break;
                            } else {
                                i11 = i12;
                                break;
                            }
                        }
                        l0.f.b next = it.next();
                        if (next.a(f10, f10)) {
                            if (i11 == next.f44157e) {
                                break;
                            } else {
                                bVar = next;
                            }
                        }
                    }
                } else if (i12 != i11) {
                    Iterator<l0.f.b> it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            i11 = i12;
                            break;
                        }
                    } while (i11 != it2.next().f44157e);
                }
            } else {
                i11 = i10;
            }
            if (i11 != -1) {
                i10 = i11;
            }
        }
        int i13 = this.f16208w;
        if (i13 == i10) {
            return;
        }
        if (this.f16207v == i10) {
            r(0.0f);
            return;
        }
        if (this.f16210x == i10) {
            r(1.0f);
            return;
        }
        this.f16210x = i10;
        if (i13 != -1) {
            C(i13, i10);
            r(1.0f);
            this.f16164F = 0.0f;
            r(1.0f);
            this.f16175K0 = null;
            return;
        }
        this.f16180N = false;
        this.f16168H = 1.0f;
        this.f16162E = 0.0f;
        this.f16164F = 0.0f;
        this.f16166G = getNanoTime();
        this.f16158C = getNanoTime();
        this.f16170I = false;
        this.f16201s = null;
        androidx.constraintlayout.motion.widget.a aVar3 = this.f16199r;
        androidx.constraintlayout.motion.widget.a.b bVar2 = aVar3.f16256c;
        this.f16160D = (bVar2 != null ? bVar2.f16280h : aVar3.j) / 1000.0f;
        this.f16207v = -1;
        aVar3.m(-1, this.f16210x);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap<View, n> map = this.f16156B;
        map.clear();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            map.put(childAt, new n(childAt));
            sparseArray.put(childAt.getId(), map.get(childAt));
        }
        this.f16172J = true;
        androidx.constraintlayout.widget.b bVarB = this.f16199r.b(i10);
        e eVar = this.f16183O0;
        eVar.e(null, bVarB);
        A();
        eVar.a();
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            n nVar = map.get(childAt2);
            if (nVar != null) {
                q qVar = nVar.f41344f;
                qVar.f41370d = 0.0f;
                qVar.f41371e = 0.0f;
                qVar.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                l lVar = nVar.f41346h;
                lVar.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                lVar.f41316d = childAt2.getVisibility();
                lVar.f41318f = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                lVar.f41319g = childAt2.getElevation();
                lVar.f41320h = childAt2.getRotation();
                lVar.f41321i = childAt2.getRotationX();
                lVar.f41314b = childAt2.getRotationY();
                lVar.j = childAt2.getScaleX();
                lVar.f41322k = childAt2.getScaleY();
                lVar.f41323l = childAt2.getPivotX();
                lVar.f41324m = childAt2.getPivotY();
                lVar.f41325n = childAt2.getTranslationX();
                lVar.f41326o = childAt2.getTranslationY();
                lVar.f41327p = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i16 = 0; i16 < childCount; i16++) {
            n nVar2 = map.get(getChildAt(i16));
            if (nVar2 != null) {
                this.f16199r.e(nVar2);
                nVar2.g(getNanoTime(), width, height);
            }
        }
        androidx.constraintlayout.motion.widget.a.b bVar3 = this.f16199r.f16256c;
        float f11 = bVar3 != null ? bVar3.f16281i : 0.0f;
        if (f11 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i17 = 0; i17 < childCount; i17++) {
                q qVar2 = map.get(getChildAt(i17)).f41345g;
                float f12 = qVar2.f41373g + qVar2.f41372f;
                fMin = Math.min(fMin, f12);
                fMax = Math.max(fMax, f12);
            }
            for (int i18 = 0; i18 < childCount; i18++) {
                n nVar3 = map.get(getChildAt(i18));
                q qVar3 = nVar3.f41345g;
                float f13 = qVar3.f41372f;
                float f14 = qVar3.f41373g;
                nVar3.f41351n = 1.0f / (1.0f - f11);
                nVar3.f41350m = f11 - ((((f13 + f14) - fMin) * f11) / (fMax - fMin));
            }
        }
        this.f16162E = 0.0f;
        this.f16164F = 0.0f;
        this.f16172J = true;
        invalidate();
    }

    public final void F(int i10, androidx.constraintlayout.widget.b bVar) {
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar != null) {
            aVar.f16260g.put(i10, bVar);
        }
        this.f16183O0.e(this.f16199r.b(this.f16207v), this.f16199r.b(this.f16210x));
        A();
        if (this.f16208w == i10) {
            bVar.b(this);
        }
    }

    public final void G(int i10, View... viewArr) {
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        androidx.constraintlayout.motion.widget.d dVar = aVar.f16269q;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        androidx.constraintlayout.motion.widget.c cVar = null;
        for (androidx.constraintlayout.motion.widget.c cVar2 : dVar.f16357b) {
            if (cVar2.f16324a == i10) {
                for (View view : viewArr) {
                    if (cVar2.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = dVar.f16356a;
                    int currentState = motionLayout.getCurrentState();
                    if (cVar2.f16328e == 2) {
                        cVar2.a(dVar, dVar.f16356a, currentState, null, viewArr2);
                    } else if (currentState == -1) {
                        motionLayout.toString();
                    } else {
                        androidx.constraintlayout.motion.widget.a aVar2 = motionLayout.f16199r;
                        androidx.constraintlayout.widget.b bVarB = aVar2 == null ? null : aVar2.b(currentState);
                        if (bVarB != null) {
                            cVar2.a(dVar, dVar.f16356a, currentState, bVarB, viewArr2);
                        }
                    }
                    arrayList.clear();
                }
                cVar = cVar2;
            }
        }
        if (cVar == null) {
            Log.e(dVar.f16359d, " Could not find ViewTransition");
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:123:0x0308  */
    /* JADX WARN: Code duplicated, block: B:125:0x030e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0312  */
    /* JADX WARN: Code duplicated, block: B:128:0x0318  */
    /* JADX WARN: Code duplicated, block: B:132:0x0325  */
    /* JADX WARN: Code duplicated, block: B:134:0x032b  */
    /* JADX WARN: Code duplicated, block: B:135:0x032e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0342  */
    /* JADX WARN: Code duplicated, block: B:140:0x0352  */
    /* JADX WARN: Code duplicated, block: B:142:0x0357  */
    /* JADX WARN: Code duplicated, block: B:145:0x0375  */
    /* JADX WARN: Code duplicated, block: B:146:0x037f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x0381  */
    /* JADX WARN: Code duplicated, block: B:149:0x038c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0398 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x039a  */
    /* JADX WARN: Code duplicated, block: B:198:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x031c A[SYNTHETIC] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d dVar;
        int i10;
        d dVar2;
        Iterator<n> it;
        int i11;
        int i12;
        q qVar;
        Paint paint;
        d dVar3;
        float f10;
        double d10;
        p077g0.c cVar;
        float f11;
        double d11;
        double dA;
        p077g0.a aVar;
        int i13;
        double[] dArr;
        float f12;
        p077g0.c cVar2;
        float f13;
        androidx.constraintlayout.motion.widget.d dVar4;
        ArrayList<androidx.constraintlayout.motion.widget.c.a> arrayList;
        Canvas canvas2 = canvas;
        int i14 = 0;
        t(false);
        androidx.constraintlayout.motion.widget.a aVar2 = this.f16199r;
        if (aVar2 != null && (dVar4 = aVar2.f16269q) != null && (arrayList = dVar4.f16360e) != null) {
            Iterator<androidx.constraintlayout.motion.widget.c.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
            ArrayList<androidx.constraintlayout.motion.widget.c.a> arrayList2 = dVar4.f16360e;
            ArrayList<androidx.constraintlayout.motion.widget.c.a> arrayList3 = dVar4.f16361f;
            arrayList2.removeAll(arrayList3);
            arrayList3.clear();
            if (dVar4.f16360e.isEmpty()) {
                dVar4.f16360e = null;
            }
        }
        super.dispatchDraw(canvas);
        if (this.f16199r == null) {
            return;
        }
        int i15 = 1;
        if ((this.f16176L & 1) == 1 && !isInEditMode()) {
            this.f16206u0++;
            long nanoTime = getNanoTime();
            long j = this.v0;
            if (j != -1) {
                long j10 = nanoTime - j;
                if (j10 > 200000000) {
                    this.f16209w0 = ((int) ((this.f16206u0 / (j10 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f16206u0 = 0;
                    this.v0 = nanoTime;
                }
            } else {
                this.v0 = nanoTime;
            }
            Paint paint2 = new Paint();
            paint2.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sbE = C4.b.e(this.f16209w0 + " fps " + p126k0.a.e(this.f16207v, this) + " -> ");
            sbE.append(p126k0.a.e(this.f16210x, this));
            sbE.append(" (progress: ");
            sbE.append(progress);
            sbE.append(" ) state=");
            int i16 = this.f16208w;
            sbE.append(i16 == -1 ? "undefined" : p126k0.a.e(i16, this));
            String string = sbE.toString();
            paint2.setColor(-16777216);
            canvas2.drawText(string, 11.0f, getHeight() - 29, paint2);
            paint2.setColor(-7864184);
            canvas2.drawText(string, 10.0f, getHeight() - 30, paint2);
        }
        if (this.f16176L > 1) {
            if (this.f16178M == null) {
                this.f16178M = new d();
            }
            d dVar5 = this.f16178M;
            HashMap<View, n> map = this.f16156B;
            androidx.constraintlayout.motion.widget.a aVar3 = this.f16199r;
            androidx.constraintlayout.motion.widget.a.b bVar = aVar3.f16256c;
            int i17 = bVar != null ? bVar.f16280h : aVar3.j;
            int i18 = this.f16176L;
            dVar5.getClass();
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            MotionLayout motionLayout = MotionLayout.this;
            boolean zIsInEditMode = motionLayout.isInEditMode();
            Paint paint3 = dVar5.f16231e;
            if (!zIsInEditMode && (i18 & 1) == 2) {
                String str = motionLayout.getContext().getResources().getResourceName(motionLayout.f16210x) + ":" + motionLayout.getProgress();
                canvas2.drawText(str, 10.0f, motionLayout.getHeight() - 30, dVar5.f16234h);
                canvas2.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint3);
            }
            Iterator<n> it3 = map.values().iterator();
            while (it3.hasNext()) {
                n next = it3.next();
                int iMax = next.f41344f.f41369c;
                ArrayList<q> arrayList4 = next.f41358u;
                Iterator<q> it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    iMax = Math.max(iMax, it4.next().f41369c);
                }
                int iMax2 = Math.max(iMax, next.f41345g.f41369c);
                if (i18 > 0 && iMax2 == 0) {
                    iMax2 = i15;
                }
                if (iMax2 != 0) {
                    float[] fArr = dVar5.f16229c;
                    if (fArr != null) {
                        double[] dArrF = next.j[i14].f();
                        int[] iArr = dVar5.f16228b;
                        if (iArr != null) {
                            Iterator<q> it5 = arrayList4.iterator();
                            int i19 = i14;
                            while (it5.hasNext()) {
                                iArr[i19] = it5.next().f41381p;
                                i19++;
                            }
                        }
                        int i20 = i14;
                        int i21 = i20;
                        while (i20 < dArrF.length) {
                            next.j[i14].c(dArrF[i20], next.f41353p);
                            next.f41344f.c(dArrF[i20], next.f41352o, next.f41353p, fArr, i21);
                            i21 += 2;
                            i20++;
                            dVar5 = dVar5;
                            i14 = 0;
                        }
                        i10 = i21 / 2;
                        dVar = dVar5;
                    } else {
                        dVar = dVar5;
                        i10 = 0;
                    }
                    dVar.f16236k = i10;
                    if (iMax2 >= 1) {
                        int i22 = i17 / 16;
                        float[] fArr2 = dVar.f16227a;
                        if (fArr2 == null || fArr2.length != i22 * 2) {
                            dVar.f16227a = new float[i22 * 2];
                            dVar.f16230d = new Path();
                        }
                        int i23 = dVar.f16238m;
                        float f14 = i23;
                        canvas2.translate(f14, f14);
                        paint3.setColor(1996488704);
                        Paint paint4 = dVar.f16235i;
                        paint4.setColor(1996488704);
                        Paint paint5 = dVar.f16232f;
                        paint5.setColor(1996488704);
                        Paint paint6 = dVar.f16233g;
                        paint6.setColor(1996488704);
                        float[] fArr3 = dVar.f16227a;
                        it = it3;
                        float f15 = 1.0f / (i22 - 1);
                        HashMap<String, p113j0.d> map2 = next.f41362y;
                        i11 = i17;
                        p113j0.d dVar6 = map2 == null ? null : map2.get("translationX");
                        HashMap<String, p113j0.d> map3 = next.f41362y;
                        p113j0.d dVar7 = map3 == null ? null : map3.get("translationY");
                        HashMap<String, p113j0.c> map4 = next.f41363z;
                        p113j0.c cVar3 = map4 == null ? null : map4.get("translationX");
                        HashMap<String, p113j0.c> map5 = next.f41363z;
                        p113j0.c cVar4 = map5 == null ? null : map5.get("translationY");
                        int i24 = 0;
                        while (true) {
                            qVar = next.f41344f;
                            float f16 = Float.NaN;
                            paint = paint5;
                            if (i24 >= i22) {
                                break;
                            }
                            float fMin = i24 * f15;
                            int i25 = i22;
                            float f17 = next.f41351n;
                            if (f17 != 1.0f) {
                                f10 = f15;
                                float f18 = next.f41350m;
                                if (fMin < f18) {
                                    fMin = 0.0f;
                                }
                                dVar3 = dVar;
                                if (fMin > f18 && fMin < 1.0d) {
                                    fMin = Math.min((fMin - f18) * f17, 1.0f);
                                }
                                d10 = fMin;
                                cVar = qVar.f41368b;
                                f11 = 0.0f;
                                for (q qVar2 : arrayList4) {
                                    double d12 = d10;
                                    cVar2 = qVar2.f41368b;
                                    if (cVar2 != null) {
                                        f13 = qVar2.f41370d;
                                        if (f13 < fMin) {
                                            cVar = cVar2;
                                            f11 = f13;
                                        } else if (Float.isNaN(f16)) {
                                            f16 = qVar2.f41370d;
                                        }
                                    }
                                    d10 = d12;
                                }
                                d11 = d10;
                                if (cVar != null) {
                                    if (Float.isNaN(f16)) {
                                        f12 = 1.0f;
                                    } else {
                                        f12 = f16;
                                    }
                                    float f19 = f12 - f11;
                                    dA = (((float) cVar.a((fMin - f11) / f19)) * f19) + f11;
                                } else {
                                    dA = d11;
                                }
                                next.j[0].c(dA, next.f41353p);
                                aVar = next.f41348k;
                                if (aVar != null) {
                                    dArr = next.f41353p;
                                    if (dArr.length > 0) {
                                        aVar.c(dA, dArr);
                                    }
                                }
                                i13 = i24 * 2;
                                ArrayList<q> arrayList5 = arrayList4;
                                next.f41344f.c(dA, next.f41352o, next.f41353p, fArr3, i13);
                                if (cVar3 != null) {
                                    fArr3[i13] = cVar3.a(fMin) + fArr3[i13];
                                } else if (dVar6 != null) {
                                    fArr3[i13] = dVar6.a(fMin) + fArr3[i13];
                                }
                                if (cVar4 != null) {
                                    int i26 = i13 + 1;
                                    fArr3[i26] = cVar4.a(fMin) + fArr3[i26];
                                } else if (dVar7 != null) {
                                    int i27 = i13 + 1;
                                    fArr3[i27] = dVar7.a(fMin) + fArr3[i27];
                                }
                                i24++;
                                paint5 = paint;
                                i22 = i25;
                                f15 = f10;
                                dVar = dVar3;
                                arrayList4 = arrayList5;
                            } else {
                                dVar3 = dVar;
                                f10 = f15;
                            }
                            d10 = fMin;
                            cVar = qVar.f41368b;
                            f11 = 0.0f;
                            while (r15.hasNext()) {
                                double d13 = d10;
                                cVar2 = qVar2.f41368b;
                                if (cVar2 != null) {
                                    f13 = qVar2.f41370d;
                                    if (f13 < fMin) {
                                        cVar = cVar2;
                                        f11 = f13;
                                    } else if (Float.isNaN(f16)) {
                                        f16 = qVar2.f41370d;
                                    }
                                }
                                d10 = d13;
                            }
                            d11 = d10;
                            if (cVar != null) {
                                if (Float.isNaN(f16)) {
                                    f12 = 1.0f;
                                } else {
                                    f12 = f16;
                                }
                                float f110 = f12 - f11;
                                dA = (((float) cVar.a((fMin - f11) / f110)) * f110) + f11;
                            } else {
                                dA = d11;
                            }
                            next.j[0].c(dA, next.f41353p);
                            aVar = next.f41348k;
                            if (aVar != null) {
                                dArr = next.f41353p;
                                if (dArr.length > 0) {
                                    aVar.c(dA, dArr);
                                }
                            }
                            i13 = i24 * 2;
                            ArrayList<q> arrayList6 = arrayList4;
                            next.f41344f.c(dA, next.f41352o, next.f41353p, fArr3, i13);
                            if (cVar3 != null) {
                                fArr3[i13] = cVar3.a(fMin) + fArr3[i13];
                            } else if (dVar6 != null) {
                                fArr3[i13] = dVar6.a(fMin) + fArr3[i13];
                            }
                            if (cVar4 != null) {
                                int i28 = i13 + 1;
                                fArr3[i28] = cVar4.a(fMin) + fArr3[i28];
                            } else if (dVar7 != null) {
                                int i29 = i13 + 1;
                                fArr3[i29] = dVar7.a(fMin) + fArr3[i29];
                            }
                            i24++;
                            paint5 = paint;
                            i22 = i25;
                            f15 = f10;
                            dVar = dVar3;
                            arrayList4 = arrayList6;
                        }
                        dVar2 = dVar;
                        dVar2.a(canvas, iMax2, dVar2.f16236k, next);
                        paint3.setColor(-21965);
                        paint.setColor(-2067046);
                        paint4.setColor(-2067046);
                        paint6.setColor(-13391360);
                        float f20 = -i23;
                        canvas.translate(f20, f20);
                        dVar2.a(canvas, iMax2, dVar2.f16236k, next);
                        if (iMax2 == 5) {
                            dVar2.f16230d.reset();
                            int i30 = 0;
                            while (i30 <= 50) {
                                next.j[0].c(next.a(i30 / 50, null), next.f41353p);
                                int[] iArr2 = next.f41352o;
                                double[] dArr2 = next.f41353p;
                                float f21 = qVar.f41372f;
                                float f22 = qVar.f41373g;
                                float f23 = qVar.f41374h;
                                float f24 = qVar.f41375i;
                                float f25 = f23;
                                float fCos = f22;
                                float f26 = f21;
                                for (int i31 = 0; i31 < iArr2.length; i31++) {
                                    float f27 = (float) dArr2[i31];
                                    int i32 = iArr2[i31];
                                    if (i32 == 1) {
                                        f26 = f27;
                                    } else if (i32 == 2) {
                                        fCos = f27;
                                    } else if (i32 == 3) {
                                        f25 = f27;
                                    } else if (i32 == 4) {
                                        f24 = f27;
                                    }
                                }
                                if (qVar.f41379n != null) {
                                    double d14 = 0.0f;
                                    double d15 = f26;
                                    double d16 = fCos;
                                    float fSin = (float) (((Math.sin(d16) * d15) + d14) - ((double) (f25 / 2.0f)));
                                    fCos = (float) ((d14 - (Math.cos(d16) * d15)) - ((double) (f24 / 2.0f)));
                                    f26 = fSin;
                                }
                                float f28 = f25 + f26;
                                float f29 = f24 + fCos;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f30 = f26 + 0.0f;
                                float f31 = fCos + 0.0f;
                                float f32 = f28 + 0.0f;
                                float f33 = f29 + 0.0f;
                                float[] fArr4 = dVar2.j;
                                fArr4[0] = f30;
                                fArr4[1] = f31;
                                fArr4[2] = f32;
                                fArr4[3] = f31;
                                fArr4[4] = f32;
                                fArr4[5] = f33;
                                fArr4[6] = f30;
                                fArr4[7] = f33;
                                dVar2.f16230d.moveTo(f30, f31);
                                dVar2.f16230d.lineTo(fArr4[2], fArr4[3]);
                                dVar2.f16230d.lineTo(fArr4[4], fArr4[5]);
                                dVar2.f16230d.lineTo(fArr4[6], fArr4[7]);
                                dVar2.f16230d.close();
                                i30++;
                                qVar = qVar;
                            }
                            i12 = 0;
                            i15 = 1;
                            paint3.setColor(1140850688);
                            canvas2 = canvas;
                            canvas2.translate(2.0f, 2.0f);
                            canvas2.drawPath(dVar2.f16230d, paint3);
                            canvas2.translate(-2.0f, -2.0f);
                            paint3.setColor(-65536);
                            canvas2.drawPath(dVar2.f16230d, paint3);
                        } else {
                            canvas2 = canvas;
                            i12 = 0;
                            i15 = 1;
                        }
                        dVar5 = dVar2;
                        i14 = i12;
                        it3 = it;
                        i17 = i11;
                        i18 = i18;
                    } else {
                        i15 = 1;
                        dVar2 = dVar;
                        it = it3;
                        i11 = i17;
                        i18 = i18;
                        i12 = 0;
                    }
                    dVar5 = dVar2;
                    i14 = i12;
                    it3 = it;
                    i17 = i11;
                    i18 = i18;
                }
            }
            canvas.restore();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void g(int i10) {
        this.f16390l = null;
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar == null) {
            return null;
        }
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = aVar.f16260g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = sparseArray.keyAt(i10);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f16208w;
    }

    public ArrayList<androidx.constraintlayout.motion.widget.a.b> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar == null) {
            return null;
        }
        return aVar.f16257d;
    }

    public p126k0.b getDesignTool() {
        if (this.f16186Q == null) {
            this.f16186Q = new p126k0.b();
        }
        return this.f16186Q;
    }

    public int getEndState() {
        return this.f16210x;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f16164F;
    }

    public androidx.constraintlayout.motion.widget.a getScene() {
        return this.f16199r;
    }

    public int getStartState() {
        return this.f16207v;
    }

    public float getTargetPosition() {
        return this.f16168H;
    }

    public Bundle getTransitionState() {
        if (this.f16173J0 == null) {
            this.f16173J0 = new g();
        }
        g gVar = this.f16173J0;
        MotionLayout motionLayout = MotionLayout.this;
        gVar.f16252d = motionLayout.f16210x;
        gVar.f16251c = motionLayout.f16207v;
        gVar.f16250b = motionLayout.getVelocity();
        gVar.f16249a = motionLayout.getProgress();
        g gVar2 = this.f16173J0;
        gVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", gVar2.f16249a);
        bundle.putFloat("motion.velocity", gVar2.f16250b);
        bundle.putInt("motion.StartState", gVar2.f16251c);
        bundle.putInt("motion.EndState", gVar2.f16252d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar != null) {
            androidx.constraintlayout.motion.widget.a.b bVar = aVar.f16256c;
            this.f16160D = (bVar != null ? bVar.f16280h : aVar.j) / 1000.0f;
        }
        return (long) (this.f16160D * 1000.0f);
    }

    public float getVelocity() {
        return this.f16205u;
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void j(int i10, View view) {
        androidx.constraintlayout.motion.widget.b bVar;
        int i11;
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar != null) {
            float f10 = this.f16197p0;
            if (f10 == 0.0f) {
                return;
            }
            float f11 = this.f16194U / f10;
            float f12 = this.f16195V / f10;
            androidx.constraintlayout.motion.widget.a.b bVar2 = aVar.f16256c;
            if (bVar2 == null || (bVar = bVar2.f16283l) == null) {
                return;
            }
            bVar.f16310m = false;
            MotionLayout motionLayout = bVar.f16315r;
            float progress = motionLayout.getProgress();
            bVar.f16315r.w(bVar.f16302d, progress, bVar.f16306h, bVar.f16305g, bVar.f16311n);
            float f13 = bVar.f16308k;
            float[] fArr = bVar.f16311n;
            float f14 = f13 != 0.0f ? (f11 * f13) / fArr[0] : (f12 * bVar.f16309l) / fArr[1];
            if (!Float.isNaN(f14)) {
                progress += f14 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i11 = bVar.f16301c) == 3) {
                return;
            }
            motionLayout.D(((double) progress) >= 0.5d ? 1.0f : 0.0f, f14, i11);
        }
    }

    @Override // androidx.core.view.InterfaceC1307w
    public final void k(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f16192T || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f16192T = false;
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final boolean m(View view, View view2, int i10, int i11) {
        androidx.constraintlayout.motion.widget.a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        return (aVar == null || (bVar = aVar.f16256c) == null || (bVar2 = bVar.f16283l) == null || (bVar2.f16320w & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void n(View view, View view2, int i10, int i11) {
        this.f16196W = getNanoTime();
        this.f16197p0 = 0.0f;
        this.f16194U = 0.0f;
        this.f16195V = 0.0f;
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // androidx.core.view.InterfaceC1306v
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        androidx.constraintlayout.motion.widget.a.b bVar;
        boolean z10;
        ?? r10;
        androidx.constraintlayout.motion.widget.b bVar2;
        float f10;
        androidx.constraintlayout.motion.widget.b bVar3;
        androidx.constraintlayout.motion.widget.b bVar4;
        androidx.constraintlayout.motion.widget.b bVar5;
        int i13;
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar == null || (bVar = aVar.f16256c) == null || (z10 = bVar.f16286o)) {
            return;
        }
        int i14 = -1;
        if (z10 || (bVar5 = bVar.f16283l) == null || (i13 = bVar5.f16303e) == -1 || view.getId() == i13) {
            androidx.constraintlayout.motion.widget.a.b bVar6 = aVar.f16256c;
            if ((bVar6 == null || (bVar4 = bVar6.f16283l) == null) ? false : bVar4.f16318u) {
                androidx.constraintlayout.motion.widget.b bVar7 = bVar.f16283l;
                if (bVar7 != null && (bVar7.f16320w & 4) != 0) {
                    i14 = i11;
                }
                float f11 = this.f16162E;
                if ((f11 == 1.0f || f11 == 0.0f) && view.canScrollVertically(i14)) {
                    return;
                }
            }
            androidx.constraintlayout.motion.widget.b bVar8 = bVar.f16283l;
            if (bVar8 != null && (bVar8.f16320w & 1) != 0) {
                float f12 = i10;
                float f13 = i11;
                androidx.constraintlayout.motion.widget.a.b bVar9 = aVar.f16256c;
                if (bVar9 == null || (bVar3 = bVar9.f16283l) == null) {
                    f10 = 0.0f;
                } else {
                    bVar3.f16315r.w(bVar3.f16302d, bVar3.f16315r.getProgress(), bVar3.f16306h, bVar3.f16305g, bVar3.f16311n);
                    float f14 = bVar3.f16308k;
                    float[] fArr = bVar3.f16311n;
                    if (f14 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f10 = (f12 * f14) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f10 = (f13 * bVar3.f16309l) / fArr[1];
                    }
                }
                float f15 = this.f16164F;
                if ((f15 <= 0.0f && f10 < 0.0f) || (f15 >= 1.0f && f10 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a((ViewGroup) view));
                    return;
                }
            }
            float f16 = this.f16162E;
            long nanoTime = getNanoTime();
            float f17 = i10;
            this.f16194U = f17;
            float f18 = i11;
            this.f16195V = f18;
            this.f16197p0 = (float) ((nanoTime - this.f16196W) * 1.0E-9d);
            this.f16196W = nanoTime;
            androidx.constraintlayout.motion.widget.a.b bVar10 = aVar.f16256c;
            if (bVar10 != null && (bVar2 = bVar10.f16283l) != null) {
                MotionLayout motionLayout = bVar2.f16315r;
                float progress = motionLayout.getProgress();
                if (!bVar2.f16310m) {
                    bVar2.f16310m = true;
                    motionLayout.setProgress(progress);
                }
                bVar2.f16315r.w(bVar2.f16302d, progress, bVar2.f16306h, bVar2.f16305g, bVar2.f16311n);
                float f19 = bVar2.f16308k;
                float[] fArr2 = bVar2.f16311n;
                if (Math.abs((bVar2.f16309l * fArr2[1]) + (f19 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f20 = bVar2.f16308k;
                float fMax = Math.max(Math.min(progress + (f20 != 0.0f ? (f17 * f20) / fArr2[0] : (f18 * bVar2.f16309l) / fArr2[1]), 1.0f), 0.0f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f16 != this.f16162E) {
                iArr[0] = i10;
                r10 = 1;
                iArr[1] = i11;
            } else {
                r10 = 1;
            }
            t(false);
            if (iArr[0] == 0 && iArr[r10] == 0) {
                return;
            }
            this.f16192T = r10;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.constraintlayout.motion.widget.a.b bVar;
        int i10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar != null && (i10 = this.f16208w) != -1) {
            androidx.constraintlayout.widget.b bVarB = aVar.b(i10);
            androidx.constraintlayout.motion.widget.a aVar2 = this.f16199r;
            int i11 = 0;
            loop0: while (true) {
                SparseArray<androidx.constraintlayout.widget.b> sparseArray = aVar2.f16260g;
                if (i11 >= sparseArray.size()) {
                    break;
                }
                int iKeyAt = sparseArray.keyAt(i11);
                SparseIntArray sparseIntArray = aVar2.f16262i;
                int i12 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (true) {
                    if (i12 > 0) {
                        if (i12 != iKeyAt) {
                            int i13 = size - 1;
                            if (size >= 0) {
                                i12 = sparseIntArray.get(i12);
                                size = i13;
                            }
                        }
                        Log.e("MotionScene", "Cannot be derived from yourself");
                        break loop0;
                    }
                    aVar2.l(iKeyAt, this);
                    i11++;
                }
            }
            if (bVarB != null) {
                bVarB.b(this);
            }
            this.f16207v = this.f16208w;
        }
        y();
        g gVar = this.f16173J0;
        if (gVar != null) {
            if (this.f16179M0) {
                post(new b());
                return;
            } else {
                gVar.a();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.a aVar3 = this.f16199r;
        if (aVar3 == null || (bVar = aVar3.f16256c) == null || bVar.f16285n != 4) {
            return;
        }
        r(1.0f);
        this.f16175K0 = null;
        setState(TransitionState.f16217c);
        setState(TransitionState.f16218d);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.b bVar;
        int i10;
        RectF rectFB;
        MotionLayout motionLayout;
        int currentState;
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar == null || !this.f16154A) {
            return false;
        }
        androidx.constraintlayout.motion.widget.d dVar = aVar.f16269q;
        if (dVar != null && (currentState = (motionLayout = dVar.f16356a).getCurrentState()) != -1) {
            HashSet<View> hashSet = dVar.f16358c;
            ArrayList<androidx.constraintlayout.motion.widget.c> arrayList = dVar.f16357b;
            if (hashSet == null) {
                dVar.f16358c = new HashSet<>();
                for (androidx.constraintlayout.motion.widget.c cVar : arrayList) {
                    int childCount = motionLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = motionLayout.getChildAt(i11);
                        if (cVar.c(childAt)) {
                            childAt.getId();
                            dVar.f16358c.add(childAt);
                        }
                    }
                }
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<androidx.constraintlayout.motion.widget.c.a> arrayList2 = dVar.f16360e;
            int i12 = 2;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (androidx.constraintlayout.motion.widget.c.a aVar2 : dVar.f16360e) {
                    if (action != 1) {
                        if (action != 2) {
                            aVar2.getClass();
                        } else {
                            View view = aVar2.f16346c.f41340b;
                            Rect rect2 = aVar2.f16354l;
                            view.getHitRect(rect2);
                            if (!rect2.contains((int) x10, (int) y10) && !aVar2.f16351h) {
                                aVar2.b();
                            }
                        }
                    } else if (!aVar2.f16351h) {
                        aVar2.b();
                    }
                }
            }
            if (action == 0 || action == 1) {
                androidx.constraintlayout.motion.widget.a aVar3 = motionLayout.f16199r;
                androidx.constraintlayout.widget.b bVarB = aVar3 == null ? null : aVar3.b(currentState);
                Iterator<androidx.constraintlayout.motion.widget.c> it = arrayList.iterator();
                while (it.hasNext()) {
                    androidx.constraintlayout.motion.widget.c next = it.next();
                    int i13 = next.f16325b;
                    if (i13 == 1) {
                        if (action == 0) {
                            for (View view2 : dVar.f16358c) {
                                if (next.c(view2)) {
                                    view2.getHitRect(rect);
                                    if (rect.contains((int) x10, (int) y10)) {
                                        next.a(dVar, dVar.f16356a, currentState, bVarB, view2);
                                    }
                                    next = next;
                                    i12 = i12;
                                }
                            }
                        }
                    } else if (i13 == i12) {
                        if (action == 1) {
                            while (r16.hasNext()) {
                                if (next.c(view2)) {
                                    view2.getHitRect(rect);
                                    if (rect.contains((int) x10, (int) y10)) {
                                        next.a(dVar, dVar.f16356a, currentState, bVarB, view2);
                                    }
                                    next = next;
                                    i12 = i12;
                                }
                            }
                        }
                    } else if (i13 == 3 && action == 0) {
                        while (r16.hasNext()) {
                            if (next.c(view2)) {
                                view2.getHitRect(rect);
                                if (rect.contains((int) x10, (int) y10)) {
                                    next.a(dVar, dVar.f16356a, currentState, bVarB, view2);
                                }
                                next = next;
                                i12 = i12;
                            }
                        }
                    }
                    i12 = i12;
                }
            }
        }
        androidx.constraintlayout.motion.widget.a.b bVar2 = this.f16199r.f16256c;
        if (bVar2 != null && !bVar2.f16286o && (bVar = bVar2.f16283l) != null && ((motionEvent.getAction() != 0 || (rectFB = bVar.b(this, new RectF())) == null || rectFB.contains(motionEvent.getX(), motionEvent.getY())) && (i10 = bVar.f16303e) != -1)) {
            View view3 = this.f16189R0;
            if (view3 == null || view3.getId() != i10) {
                this.f16189R0 = findViewById(i10);
            }
            View view4 = this.f16189R0;
            if (view4 != null) {
                RectF rectF = this.f16187Q0;
                rectF.set(view4.getLeft(), this.f16189R0.getTop(), this.f16189R0.getRight(), this.f16189R0.getBottom());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && !x(this.f16189R0.getLeft(), this.f16189R0.getTop(), this.f16189R0, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f16171I0 = true;
        try {
            if (this.f16199r == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            }
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.f16188R != i14 || this.f16190S != i15) {
                A();
                t(true);
            }
            this.f16188R = i14;
            this.f16190S = i15;
        } finally {
            this.f16171I0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        if (this.f16199r == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z11 = true;
        boolean z12 = (this.f16212y == i10 && this.f16214z == i11) ? false : true;
        if (this.f16185P0) {
            this.f16185P0 = false;
            y();
            z();
            z12 = true;
        }
        if (this.f16388i) {
            z12 = true;
        }
        this.f16212y = i10;
        this.f16214z = i11;
        int iG = this.f16199r.g();
        androidx.constraintlayout.motion.widget.a.b bVar = this.f16199r.f16256c;
        int i12 = bVar == null ? -1 : bVar.f16275c;
        androidx.constraintlayout.core.widgets.d dVar = this.f16383d;
        e eVar = this.f16183O0;
        if ((!z12 && iG == eVar.f16244e && i12 == eVar.f16245f) || this.f16207v == -1) {
            if (z12) {
                super.onMeasure(i10, i11);
            }
            z10 = true;
        } else {
            super.onMeasure(i10, i11);
            eVar.e(this.f16199r.b(iG), this.f16199r.b(i12));
            eVar.f();
            eVar.f16244e = iG;
            eVar.f16245f = i12;
            z10 = false;
        }
        if (this.f16215z0 || z10) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iU = dVar.u() + getPaddingRight() + getPaddingLeft();
            int iO = dVar.o() + paddingBottom;
            int i13 = this.f16163E0;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                int i14 = this.f16155A0;
                iU = (int) ((this.f16167G0 * (this.f16159C0 - i14)) + i14);
                requestLayout();
            }
            int i15 = this.f16165F0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                int i16 = this.f16157B0;
                iO = (int) ((this.f16167G0 * (this.f16161D0 - i16)) + i16);
                requestLayout();
            }
            setMeasuredDimension(iU, iO);
        }
        float fSignum = Math.signum(this.f16168H - this.f16164F);
        long nanoTime = getNanoTime();
        p pVar = this.f16201s;
        float interpolation = this.f16164F + (!(pVar instanceof p113j0.b) ? (((nanoTime - this.f16166G) * fSignum) * 1.0E-9f) / this.f16160D : 0.0f);
        if (this.f16170I) {
            interpolation = this.f16168H;
        }
        if ((fSignum <= 0.0f || interpolation < this.f16168H) && (fSignum > 0.0f || interpolation > this.f16168H)) {
            z11 = false;
        } else {
            interpolation = this.f16168H;
        }
        if (pVar != null && !z11) {
            interpolation = this.f16180N ? pVar.getInterpolation((nanoTime - this.f16158C) * 1.0E-9f) : pVar.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f16168H) || (fSignum <= 0.0f && interpolation <= this.f16168H)) {
            interpolation = this.f16168H;
        }
        this.f16167G0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f16203t;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            n nVar = this.f16156B.get(childAt);
            if (nVar != null) {
                nVar.d(interpolation, nanoTime2, this.f16169H0, childAt);
            }
        }
        if (this.f16215z0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar != null) {
            boolean zF = f();
            aVar.f16268p = zF;
            androidx.constraintlayout.motion.widget.a.b bVar2 = aVar.f16256c;
            if (bVar2 == null || (bVar = bVar2.f16283l) == null) {
                return;
            }
            bVar.c(zF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x022a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0230  */
    /* JADX WARN: Code duplicated, block: B:115:0x0234  */
    /* JADX WARN: Code duplicated, block: B:130:0x0261  */
    /* JADX WARN: Code duplicated, block: B:201:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:202:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:205:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:207:0x050c  */
    /* JADX WARN: Code duplicated, block: B:235:0x056a  */
    /* JADX WARN: Code duplicated, block: B:237:0x056f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0575  */
    /* JADX WARN: Code duplicated, block: B:362:0x079a  */
    /* JADX WARN: Code duplicated, block: B:365:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:374:0x07ce  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.a.b bVar;
        f fVar;
        f fVar2;
        androidx.constraintlayout.motion.widget.b bVar2;
        char c10;
        char c11;
        int i10;
        char c12;
        char c13;
        char c14;
        float right;
        float f10;
        int top;
        int bottom;
        int i11;
        float degrees;
        float f11;
        int i12;
        char c15;
        MotionEvent motionEvent2;
        RectF rectF;
        androidx.constraintlayout.motion.widget.a.b bVar3;
        int iA;
        Iterator it;
        MotionLayout motionLayout = this;
        androidx.constraintlayout.motion.widget.a aVar = motionLayout.f16199r;
        if (aVar == null || !motionLayout.f16154A || !aVar.n()) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.constraintlayout.motion.widget.a aVar2 = motionLayout.f16199r;
        androidx.constraintlayout.motion.widget.a.b bVar4 = aVar2.f16256c;
        if (bVar4 != null && bVar4.f16286o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        RectF rectF2 = new RectF();
        f fVar3 = aVar2.f16267o;
        MotionLayout motionLayout2 = aVar2.f16254a;
        if (fVar3 == null) {
            motionLayout2.getClass();
            f fVar4 = f.f16247b;
            fVar4.f16248a = VelocityTracker.obtain();
            aVar2.f16267o = fVar4;
        }
        VelocityTracker velocityTracker = aVar2.f16267o.f16248a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                aVar2.f16270r = motionEvent.getRawX();
                aVar2.f16271s = motionEvent.getRawY();
                aVar2.f16264l = motionEvent;
                aVar2.f16265m = false;
                androidx.constraintlayout.motion.widget.b bVar5 = aVar2.f16256c.f16283l;
                if (bVar5 != null) {
                    RectF rectFA = bVar5.a(motionLayout2, rectF2);
                    if (rectFA == null || rectFA.contains(aVar2.f16264l.getX(), aVar2.f16264l.getY())) {
                        RectF rectFB = aVar2.f16256c.f16283l.b(motionLayout2, rectF2);
                        if (rectFB == null || rectFB.contains(aVar2.f16264l.getX(), aVar2.f16264l.getY())) {
                            aVar2.f16266n = false;
                        } else {
                            aVar2.f16266n = true;
                        }
                        androidx.constraintlayout.motion.widget.b bVar6 = aVar2.f16256c.f16283l;
                        float f12 = aVar2.f16270r;
                        float f13 = aVar2.f16271s;
                        bVar6.f16313p = f12;
                        bVar6.f16314q = f13;
                    } else {
                        aVar2.f16264l = null;
                        aVar2.f16265m = true;
                    }
                }
            } else if (action == 2 && !aVar2.f16265m) {
                float rawY = motionEvent.getRawY() - aVar2.f16271s;
                float rawX = motionEvent.getRawX() - aVar2.f16270r;
                if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = aVar2.f16264l) != null) {
                    if (currentState != -1) {
                        p139l0.f fVar5 = aVar2.f16255b;
                        if (fVar5 == null || (iA = fVar5.a(currentState)) == -1) {
                            iA = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (androidx.constraintlayout.motion.widget.a.b bVar7 : aVar2.f16257d) {
                            if (bVar7.f16276d == iA || bVar7.f16275c == iA) {
                                arrayList.add(bVar7);
                            }
                        }
                        RectF rectF3 = new RectF();
                        Iterator it2 = arrayList.iterator();
                        float f14 = 0.0f;
                        bVar3 = null;
                        while (it2.hasNext()) {
                            androidx.constraintlayout.motion.widget.a.b bVar8 = (androidx.constraintlayout.motion.widget.a.b) it2.next();
                            if (bVar8.f16286o) {
                                it = it2;
                            } else {
                                androidx.constraintlayout.motion.widget.b bVar9 = bVar8.f16283l;
                                if (bVar9 != null) {
                                    bVar9.c(aVar2.f16268p);
                                    RectF rectFB2 = bVar8.f16283l.b(motionLayout2, rectF3);
                                    if (rectFB2 != null) {
                                        it = it2;
                                        if (!rectFB2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        }
                                    } else {
                                        it = it2;
                                    }
                                    RectF rectFA2 = bVar8.f16283l.a(motionLayout2, rectF3);
                                    if (rectFA2 == null || rectFA2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        androidx.constraintlayout.motion.widget.b bVar10 = bVar8.f16283l;
                                        float fAtan2 = (bVar10.f16309l * rawY) + (bVar10.f16308k * rawX);
                                        if (bVar10.j) {
                                            float x10 = motionEvent2.getX();
                                            bVar8.f16283l.getClass();
                                            float f15 = x10 - 0.5f;
                                            float y10 = motionEvent2.getY();
                                            bVar8.f16283l.getClass();
                                            float f16 = y10 - 0.5f;
                                            fAtan2 = ((float) (Math.atan2(rawY + f16, rawX + f15) - Math.atan2(f15, f16))) * 10.0f;
                                        }
                                        float f17 = fAtan2 * (bVar8.f16275c == currentState ? -1.0f : 1.1f);
                                        if (f17 > f14) {
                                            f14 = f17;
                                            bVar3 = bVar8;
                                        }
                                        it2 = it;
                                        rectF3 = rectF3;
                                        rawY = rawY;
                                        rawX = rawX;
                                        rectF2 = rectF2;
                                    }
                                } else {
                                    rectF2 = rectF2;
                                    it = it2;
                                    rectF3 = rectF3;
                                    bVar3 = bVar3;
                                    rawY = rawY;
                                    rawX = rawX;
                                }
                                bVar3 = bVar3;
                                it2 = it;
                                rectF3 = rectF3;
                                rawY = rawY;
                                rawX = rawX;
                                rectF2 = rectF2;
                            }
                            it2 = it;
                        }
                        rectF = rectF2;
                    } else {
                        rectF = rectF2;
                        bVar3 = aVar2.f16256c;
                    }
                    if (bVar3 != null) {
                        motionLayout.setTransition(bVar3);
                        RectF rectFB3 = aVar2.f16256c.f16283l.b(motionLayout2, rectF);
                        aVar2.f16266n = (rectFB3 == null || rectFB3.contains(aVar2.f16264l.getX(), aVar2.f16264l.getY())) ? false : true;
                        androidx.constraintlayout.motion.widget.b bVar11 = aVar2.f16256c.f16283l;
                        float f18 = aVar2.f16270r;
                        float f19 = aVar2.f16271s;
                        bVar11.f16313p = f18;
                        bVar11.f16314q = f19;
                        bVar11.f16310m = false;
                    }
                    if (!aVar2.f16265m) {
                        bVar = aVar2.f16256c;
                        if (bVar != null) {
                            aVar2 = aVar2;
                        } else {
                            aVar2 = aVar2;
                        }
                        androidx.constraintlayout.motion.widget.a aVar3 = aVar2;
                        aVar3.f16270r = motionEvent.getRawX();
                        aVar3.f16271s = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            motionLayout = this;
                        } else {
                            motionLayout = this;
                        }
                    }
                }
            } else if (!aVar2.f16265m) {
                bVar = aVar2.f16256c;
                if (bVar != null) {
                    aVar2 = aVar2;
                } else {
                    aVar2 = aVar2;
                }
                androidx.constraintlayout.motion.widget.a aVar4 = aVar2;
                aVar4.f16270r = motionEvent.getRawX();
                aVar4.f16271s = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    motionLayout = this;
                } else {
                    motionLayout = this;
                }
            }
        } else if (!aVar2.f16265m) {
            bVar = aVar2.f16256c;
            if (bVar != null || (bVar2 = bVar.f16283l) == null || aVar2.f16266n) {
                aVar2 = aVar2;
            } else {
                f fVar6 = aVar2.f16267o;
                boolean z10 = bVar2.j;
                TransitionState transitionState = TransitionState.f16219e;
                float[] fArr = bVar2.f16311n;
                MotionLayout motionLayout3 = bVar2.f16315r;
                if (z10) {
                    VelocityTracker velocityTracker2 = fVar6.f16248a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    int action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        int[] iArr = bVar2.f16312o;
                        if (action2 == 1) {
                            aVar2 = aVar2;
                            bVar2.f16310m = false;
                            VelocityTracker velocityTracker3 = fVar6.f16248a;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(16);
                            }
                            VelocityTracker velocityTracker4 = fVar6.f16248a;
                            float xVelocity = velocityTracker4 != null ? velocityTracker4.getXVelocity() : 0.0f;
                            VelocityTracker velocityTracker5 = fVar6.f16248a;
                            float yVelocity = velocityTracker5 != null ? velocityTracker5.getYVelocity() : 0.0f;
                            float progress = motionLayout3.getProgress();
                            float width = motionLayout3.getWidth() / 2.0f;
                            float height = motionLayout3.getHeight() / 2.0f;
                            int i13 = bVar2.f16307i;
                            if (i13 != -1) {
                                View viewFindViewById = motionLayout3.findViewById(i13);
                                motionLayout3.getLocationOnScreen(iArr);
                                right = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                f10 = iArr[1];
                                top = viewFindViewById.getTop();
                                bottom = viewFindViewById.getBottom();
                            } else {
                                int i14 = bVar2.f16302d;
                                if (i14 != -1) {
                                    View viewFindViewById2 = motionLayout3.findViewById(motionLayout3.f16156B.get(motionLayout3.findViewById(i14)).f41344f.f41377l);
                                    motionLayout3.getLocationOnScreen(iArr);
                                    right = iArr[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                    f10 = iArr[1];
                                    top = viewFindViewById2.getTop();
                                    bottom = viewFindViewById2.getBottom();
                                } else {
                                    float rawX2 = motionEvent.getRawX() - width;
                                    float rawY2 = motionEvent.getRawY() - height;
                                    double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
                                    i11 = bVar2.f16302d;
                                    if (i11 != -1) {
                                        bVar2.f16315r.w(i11, progress, bVar2.f16306h, bVar2.f16305g, bVar2.f16311n);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity + rawY2, xVelocity + rawX2)) - degrees2)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f11 = progress;
                                    } else {
                                        f11 = (((degrees * 3.0f) * bVar2.f16319v) / fArr[1]) + progress;
                                    }
                                    if (f11 == 0.0f && f11 != 1.0f && (i12 = bVar2.f16301c) != 3) {
                                        float fAbs = (degrees * bVar2.f16319v) / fArr[1];
                                        float f20 = ((double) f11) < 0.5d ? 0.0f : 1.0f;
                                        if (i12 == 6) {
                                            if (progress + fAbs < 0.0f) {
                                                fAbs = Math.abs(fAbs);
                                            }
                                            f20 = 1.0f;
                                        }
                                        if (bVar2.f16301c == 7) {
                                            if (progress + fAbs > 1.0f) {
                                                fAbs = -Math.abs(fAbs);
                                            }
                                            f20 = 0.0f;
                                        }
                                        motionLayout3.D(f20, fAbs * 3.0f, bVar2.f16301c);
                                        if (0.0f >= progress || 1.0f <= progress) {
                                            motionLayout3.setState(transitionState);
                                        }
                                    } else if (0.0f < f11 || 1.0f <= f11) {
                                        motionLayout3.setState(transitionState);
                                    }
                                }
                            }
                            float f21 = right;
                            height = ((bottom + top) / 2.0f) + f10;
                            width = f21;
                            float rawX3 = motionEvent.getRawX() - width;
                            float rawY3 = motionEvent.getRawY() - height;
                            double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
                            i11 = bVar2.f16302d;
                            if (i11 != -1) {
                                bVar2.f16315r.w(i11, progress, bVar2.f16306h, bVar2.f16305g, bVar2.f16311n);
                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                            } else {
                                fArr[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity + rawY3, xVelocity + rawX3)) - degrees3)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f11 = (((degrees * 3.0f) * bVar2.f16319v) / fArr[1]) + progress;
                            } else {
                                f11 = progress;
                            }
                            if (f11 == 0.0f) {
                                if (0.0f < f11) {
                                    motionLayout3.setState(transitionState);
                                } else {
                                    motionLayout3.setState(transitionState);
                                }
                            } else if (0.0f < f11) {
                                motionLayout3.setState(transitionState);
                            } else {
                                motionLayout3.setState(transitionState);
                            }
                        } else if (action2 != 2) {
                            aVar2 = aVar2;
                        } else {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            float width2 = motionLayout3.getWidth() / 2.0f;
                            float height2 = motionLayout3.getHeight() / 2.0f;
                            int i15 = bVar2.f16307i;
                            if (i15 != -1) {
                                View viewFindViewById3 = motionLayout3.findViewById(i15);
                                motionLayout3.getLocationOnScreen(iArr);
                                float right2 = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                height2 = ((viewFindViewById3.getBottom() + viewFindViewById3.getTop()) / 2.0f) + iArr[1];
                                width2 = right2;
                            } else {
                                int i16 = bVar2.f16302d;
                                if (i16 != -1) {
                                    View viewFindViewById4 = motionLayout3.findViewById(motionLayout3.f16156B.get(motionLayout3.findViewById(i16)).f41344f.f41377l);
                                    if (viewFindViewById4 == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        motionLayout3.getLocationOnScreen(iArr);
                                        width2 = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                        height2 = iArr[1] + ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f);
                                    }
                                }
                            }
                            float rawX4 = motionEvent.getRawX() - width2;
                            float rawY4 = motionEvent.getRawY() - height2;
                            double dAtan2 = Math.atan2(motionEvent.getRawY() - height2, motionEvent.getRawX() - width2);
                            float fAtan3 = (float) (((dAtan2 - Math.atan2(bVar2.f16314q - height2, bVar2.f16313p - width2)) * 180.0d) / 3.141592653589793d);
                            if (fAtan3 > 330.0f) {
                                fAtan3 -= 360.0f;
                            } else if (fAtan3 < -330.0f) {
                                fAtan3 += 360.0f;
                            }
                            if (Math.abs(fAtan3) > 0.01d || bVar2.f16310m) {
                                float progress2 = motionLayout3.getProgress();
                                if (!bVar2.f16310m) {
                                    bVar2.f16310m = true;
                                    motionLayout3.setProgress(progress2);
                                }
                                int i17 = bVar2.f16302d;
                                if (i17 != -1) {
                                    bVar2.f16315r.w(i17, progress2, bVar2.f16306h, bVar2.f16305g, bVar2.f16311n);
                                    c15 = 1;
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    c15 = 1;
                                    fArr[1] = 360.0f;
                                }
                                float fMax = Math.max(Math.min(((fAtan3 * bVar2.f16319v) / fArr[c15]) + progress2, 1.0f), 0.0f);
                                float progress3 = motionLayout3.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 == 0.0f || progress3 == 1.0f) {
                                        motionLayout3.s(progress3 == 0.0f);
                                    }
                                    motionLayout3.setProgress(fMax);
                                    VelocityTracker velocityTracker6 = fVar6.f16248a;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
                                    }
                                    VelocityTracker velocityTracker7 = fVar6.f16248a;
                                    float xVelocity2 = velocityTracker7 != null ? velocityTracker7.getXVelocity() : 0.0f;
                                    VelocityTracker velocityTracker8 = fVar6.f16248a;
                                    double yVelocity2 = velocityTracker8 != null ? velocityTracker8.getYVelocity() : 0.0f;
                                    double d10 = xVelocity2;
                                    motionLayout3.f16205u = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity2, d10) - dAtan2) * Math.hypot(yVelocity2, d10)) / Math.hypot(rawX4, rawY4)));
                                } else {
                                    motionLayout3.f16205u = 0.0f;
                                }
                                bVar2.f16313p = motionEvent.getRawX();
                                bVar2.f16314q = motionEvent.getRawY();
                            } else {
                                aVar2 = aVar2;
                            }
                        }
                    } else {
                        aVar2 = aVar2;
                        bVar2.f16313p = motionEvent.getRawX();
                        bVar2.f16314q = motionEvent.getRawY();
                        bVar2.f16310m = false;
                    }
                } else {
                    aVar2 = aVar2;
                    VelocityTracker velocityTracker9 = fVar6.f16248a;
                    if (velocityTracker9 != null) {
                        velocityTracker9.addMovement(motionEvent);
                    }
                    int action3 = motionEvent.getAction();
                    if (action3 == 0) {
                        bVar2.f16313p = motionEvent.getRawX();
                        bVar2.f16314q = motionEvent.getRawY();
                        bVar2.f16310m = false;
                    } else if (action3 == 1) {
                        bVar2.f16310m = false;
                        VelocityTracker velocityTracker10 = fVar6.f16248a;
                        if (velocityTracker10 != null) {
                            velocityTracker10.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
                        }
                        VelocityTracker velocityTracker11 = fVar6.f16248a;
                        float xVelocity3 = velocityTracker11 != null ? velocityTracker11.getXVelocity() : 0.0f;
                        VelocityTracker velocityTracker12 = fVar6.f16248a;
                        float yVelocity3 = velocityTracker12 != null ? velocityTracker12.getYVelocity() : 0.0f;
                        float progress4 = motionLayout3.getProgress();
                        int i18 = bVar2.f16302d;
                        if (i18 != -1) {
                            bVar2.f16315r.w(i18, progress4, bVar2.f16306h, bVar2.f16305g, bVar2.f16311n);
                            c11 = 0;
                            c10 = 1;
                        } else {
                            float fMin = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                            c10 = 1;
                            fArr[1] = bVar2.f16309l * fMin;
                            c11 = 0;
                            fArr[0] = fMin * bVar2.f16308k;
                        }
                        float fAbs2 = bVar2.f16308k != 0.0f ? xVelocity3 / fArr[c11] : yVelocity3 / fArr[c10];
                        float f22 = !Float.isNaN(fAbs2) ? (fAbs2 / 3.0f) + progress4 : progress4;
                        if (f22 != 0.0f && f22 != 1.0f && (i10 = bVar2.f16301c) != 3) {
                            float f23 = ((double) f22) < 0.5d ? 0.0f : 1.0f;
                            if (i10 == 6) {
                                if (progress4 + fAbs2 < 0.0f) {
                                    fAbs2 = Math.abs(fAbs2);
                                }
                                f23 = 1.0f;
                            }
                            if (bVar2.f16301c == 7) {
                                if (progress4 + fAbs2 > 1.0f) {
                                    fAbs2 = -Math.abs(fAbs2);
                                }
                                f23 = 0.0f;
                            }
                            motionLayout3.D(f23, fAbs2, bVar2.f16301c);
                            if (0.0f >= progress4 || 1.0f <= progress4) {
                                motionLayout3.setState(transitionState);
                            }
                        } else if (0.0f >= f22 || 1.0f <= f22) {
                            motionLayout3.setState(transitionState);
                        }
                    } else if (action3 == 2) {
                        float rawY5 = motionEvent.getRawY() - bVar2.f16314q;
                        float rawX5 = motionEvent.getRawX() - bVar2.f16313p;
                        if (Math.abs((bVar2.f16309l * rawY5) + (bVar2.f16308k * rawX5)) > bVar2.f16321x || bVar2.f16310m) {
                            float progress5 = motionLayout3.getProgress();
                            if (!bVar2.f16310m) {
                                bVar2.f16310m = true;
                                motionLayout3.setProgress(progress5);
                            }
                            int i19 = bVar2.f16302d;
                            if (i19 != -1) {
                                bVar2.f16315r.w(i19, progress5, bVar2.f16306h, bVar2.f16305g, bVar2.f16311n);
                                c13 = 0;
                                c12 = 1;
                            } else {
                                float fMin2 = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                                c12 = 1;
                                fArr[1] = bVar2.f16309l * fMin2;
                                c13 = 0;
                                fArr[0] = fMin2 * bVar2.f16308k;
                            }
                            if (Math.abs(((bVar2.f16309l * fArr[c12]) + (bVar2.f16308k * fArr[c13])) * bVar2.f16319v) < 0.01d) {
                                c14 = 0;
                                fArr[0] = 0.01f;
                                fArr[c12] = 0.01f;
                            } else {
                                c14 = 0;
                            }
                            float fMax2 = Math.max(Math.min(progress5 + (bVar2.f16308k != 0.0f ? rawX5 / fArr[c14] : rawY5 / fArr[c12]), 1.0f), 0.0f);
                            if (bVar2.f16301c == 6) {
                                fMax2 = Math.max(fMax2, 0.01f);
                            }
                            if (bVar2.f16301c == 7) {
                                fMax2 = Math.min(fMax2, 0.99f);
                            }
                            float progress6 = motionLayout3.getProgress();
                            if (fMax2 != progress6) {
                                if (progress6 == 0.0f || progress6 == 1.0f) {
                                    motionLayout3.s(progress6 == 0.0f);
                                }
                                motionLayout3.setProgress(fMax2);
                                VelocityTracker velocityTracker13 = fVar6.f16248a;
                                if (velocityTracker13 != null) {
                                    velocityTracker13.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
                                }
                                VelocityTracker velocityTracker14 = fVar6.f16248a;
                                float xVelocity4 = velocityTracker14 != null ? velocityTracker14.getXVelocity() : 0.0f;
                                VelocityTracker velocityTracker15 = fVar6.f16248a;
                                motionLayout3.f16205u = bVar2.f16308k != 0.0f ? xVelocity4 / fArr[0] : (velocityTracker15 != null ? velocityTracker15.getYVelocity() : 0.0f) / fArr[1];
                            } else {
                                motionLayout3.f16205u = 0.0f;
                            }
                            bVar2.f16313p = motionEvent.getRawX();
                            bVar2.f16314q = motionEvent.getRawY();
                        }
                    }
                }
            }
            androidx.constraintlayout.motion.widget.a aVar5 = aVar2;
            aVar5.f16270r = motionEvent.getRawX();
            aVar5.f16271s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 || (fVar = aVar5.f16267o) == null) {
                motionLayout = this;
            } else {
                VelocityTracker velocityTracker16 = fVar.f16248a;
                if (velocityTracker16 != null) {
                    velocityTracker16.recycle();
                    fVar2 = null;
                    fVar.f16248a = null;
                } else {
                    fVar2 = null;
                }
                aVar5.f16267o = fVar2;
                motionLayout = this;
                int i20 = motionLayout.f16208w;
                if (i20 != -1) {
                    aVar5.a(i20, motionLayout);
                }
            }
        }
        androidx.constraintlayout.motion.widget.a.b bVar12 = motionLayout.f16199r.f16256c;
        if ((bVar12.f16289r & 4) != 0) {
            return bVar12.f16283l.f16310m;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof o) {
            o oVar = (o) view;
            if (this.f16204t0 == null) {
                this.f16204t0 = new CopyOnWriteArrayList<>();
            }
            this.f16204t0.add(oVar);
            if (oVar.j) {
                if (this.f16200r0 == null) {
                    this.f16200r0 = new ArrayList<>();
                }
                this.f16200r0.add(oVar);
            }
            if (oVar.f41364k) {
                if (this.f16202s0 == null) {
                    this.f16202s0 = new ArrayList<>();
                }
                this.f16202s0.add(oVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<o> arrayList = this.f16200r0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<o> arrayList2 = this.f16202s0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void r(float f10) {
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar == null) {
            return;
        }
        float f11 = this.f16164F;
        float f12 = this.f16162E;
        if (f11 != f12 && this.f16170I) {
            this.f16164F = f12;
        }
        float f13 = this.f16164F;
        if (f13 == f10) {
            return;
        }
        this.f16180N = false;
        this.f16168H = f10;
        androidx.constraintlayout.motion.widget.a.b bVar = aVar.f16256c;
        this.f16160D = (bVar != null ? bVar.f16280h : aVar.j) / 1000.0f;
        setProgress(f10);
        this.f16201s = null;
        this.f16203t = this.f16199r.d();
        this.f16170I = false;
        this.f16158C = getNanoTime();
        this.f16172J = true;
        this.f16162E = f13;
        this.f16164F = f13;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        androidx.constraintlayout.motion.widget.a aVar;
        androidx.constraintlayout.motion.widget.a.b bVar;
        if (!this.f16215z0 && this.f16208w == -1 && (aVar = this.f16199r) != null && (bVar = aVar.f16256c) != null) {
            int i10 = bVar.f16288q;
            if (i10 == 0) {
                return;
            }
            if (i10 == 2) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.f16156B.get(getChildAt(i11)).f41342d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final void s(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            n nVar = this.f16156B.get(getChildAt(i10));
            if (nVar != null && "button".equals(p126k0.a.d(nVar.f41340b)) && nVar.f41331A != null) {
                int i11 = 0;
                while (true) {
                    p126k0.k[] kVarArr = nVar.f41331A;
                    if (i11 < kVarArr.length) {
                        kVarArr[i11].g(nVar.f41340b, z10 ? -100.0f : 100.0f);
                        i11++;
                    }
                }
            }
        }
    }

    public void setDebugMode(int i10) {
        this.f16176L = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f16179M0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f16154A = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.f16199r != null) {
            setState(TransitionState.f16218d);
            Interpolator interpolatorD = this.f16199r.d();
            if (interpolatorD != null) {
                setProgress(interpolatorD.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<o> arrayList = this.f16202s0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f16202s0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<o> arrayList = this.f16200r0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f16200r0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        if (f10 >= 0.0f) {
            int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.f16173J0 == null) {
                this.f16173J0 = new g();
            }
            this.f16173J0.f16249a = f10;
            return;
        }
        TransitionState transitionState = TransitionState.f16219e;
        TransitionState transitionState2 = TransitionState.f16218d;
        if (f10 <= 0.0f) {
            if (this.f16164F == 1.0f && this.f16208w == this.f16210x) {
                setState(transitionState2);
            }
            this.f16208w = this.f16207v;
            if (this.f16164F == 0.0f) {
                setState(transitionState);
            }
        } else if (f10 >= 1.0f) {
            if (this.f16164F == 0.0f && this.f16208w == this.f16207v) {
                setState(transitionState2);
            }
            this.f16208w = this.f16210x;
            if (this.f16164F == 1.0f) {
                setState(transitionState);
            }
        } else {
            this.f16208w = -1;
            setState(transitionState2);
        }
        if (this.f16199r == null) {
            return;
        }
        this.f16170I = true;
        this.f16168H = f10;
        this.f16162E = f10;
        this.f16166G = -1L;
        this.f16158C = -1L;
        this.f16201s = null;
        this.f16172J = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        androidx.constraintlayout.motion.widget.b bVar;
        this.f16199r = aVar;
        boolean zF = f();
        aVar.f16268p = zF;
        androidx.constraintlayout.motion.widget.a.b bVar2 = aVar.f16256c;
        if (bVar2 != null && (bVar = bVar2.f16283l) != null) {
            bVar.c(zF);
        }
        A();
    }

    public void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.f16208w = i10;
            return;
        }
        if (this.f16173J0 == null) {
            this.f16173J0 = new g();
        }
        g gVar = this.f16173J0;
        gVar.f16251c = i10;
        gVar.f16252d = i10;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.f16219e;
        if (transitionState == transitionState2 && this.f16208w == -1) {
            return;
        }
        TransitionState transitionState3 = this.f16181N0;
        this.f16181N0 = transitionState;
        TransitionState transitionState4 = TransitionState.f16218d;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            u();
        }
        int iOrdinal = transitionState3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && transitionState == transitionState2) {
                v();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            u();
        }
        if (transitionState == transitionState2) {
            v();
        }
    }

    public void setTransition(int i10) {
        androidx.constraintlayout.motion.widget.a.b next;
        float f10;
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar != null) {
            Iterator<androidx.constraintlayout.motion.widget.a.b> it = aVar.f16257d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.f16273a != i10);
            this.f16207v = next.f16276d;
            this.f16210x = next.f16275c;
            if (!isAttachedToWindow()) {
                if (this.f16173J0 == null) {
                    this.f16173J0 = new g();
                }
                g gVar = this.f16173J0;
                gVar.f16251c = this.f16207v;
                gVar.f16252d = this.f16210x;
                return;
            }
            int i11 = this.f16208w;
            if (i11 == this.f16207v) {
                f10 = 0.0f;
            } else {
                f10 = i11 == this.f16210x ? 1.0f : Float.NaN;
            }
            androidx.constraintlayout.motion.widget.a aVar2 = this.f16199r;
            aVar2.f16256c = next;
            androidx.constraintlayout.motion.widget.b bVar = next.f16283l;
            if (bVar != null) {
                bVar.c(aVar2.f16268p);
            }
            this.f16183O0.e(this.f16199r.b(this.f16207v), this.f16199r.b(this.f16210x));
            A();
            if (this.f16164F != f10) {
                if (f10 == 0.0f) {
                    s(true);
                    this.f16199r.b(this.f16207v).b(this);
                } else if (f10 == 1.0f) {
                    s(false);
                    this.f16199r.b(this.f16210x).b(this);
                }
            }
            this.f16164F = Float.isNaN(f10) ? 0.0f : f10;
            if (!Float.isNaN(f10)) {
                setProgress(f10);
            } else {
                p126k0.a.b();
                r(0.0f);
            }
        }
    }

    public void setTransitionDuration(int i10) {
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        androidx.constraintlayout.motion.widget.a.b bVar = aVar.f16256c;
        if (bVar != null) {
            bVar.f16280h = Math.max(i10, 8);
        } else {
            aVar.j = i10;
        }
    }

    public void setTransitionListener(h hVar) {
        this.f16174K = hVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f16173J0 == null) {
            this.f16173J0 = new g();
        }
        g gVar = this.f16173J0;
        gVar.getClass();
        gVar.f16249a = bundle.getFloat("motion.progress");
        gVar.f16250b = bundle.getFloat("motion.velocity");
        gVar.f16251c = bundle.getInt("motion.StartState");
        gVar.f16252d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f16173J0.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0186  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01da  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:146:0x0214  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db A[PHI: r3
      0x00db: PHI (r3v16 float) = (r3v15 float), (r3v17 float), (r3v17 float) binds: [B:47:0x00a9, B:58:0x00cf, B:60:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0142  */
    /* JADX WARN: Code duplicated, block: B:91:0x0144  */
    /* JADX WARN: Code duplicated, block: B:94:0x014c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0163  */
    /* JADX WARN: Code duplicated, block: B:99:0x0171  */
    public final void t(boolean z10) {
        boolean z11;
        char c10;
        TransitionState transitionState;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i10;
        int i11;
        int i12;
        int i13;
        View childAt;
        n nVar;
        boolean z12;
        if (this.f16166G == -1) {
            this.f16166G = getNanoTime();
        }
        float f10 = this.f16164F;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f16208w = -1;
        }
        boolean z13 = false;
        if (this.f16198q0 || (this.f16172J && (z10 || this.f16168H != f10))) {
            float fSignum = Math.signum(this.f16168H - f10);
            long nanoTime2 = getNanoTime();
            p pVar = this.f16201s;
            float f11 = pVar == null ? (((nanoTime2 - this.f16166G) * fSignum) * 1.0E-9f) / this.f16160D : 0.0f;
            float f12 = this.f16164F + f11;
            if (this.f16170I) {
                f12 = this.f16168H;
            }
            if ((fSignum <= 0.0f || f12 < this.f16168H) && (fSignum > 0.0f || f12 > this.f16168H)) {
                z11 = false;
            } else {
                f12 = this.f16168H;
                this.f16172J = false;
                z11 = true;
            }
            this.f16164F = f12;
            this.f16162E = f12;
            this.f16166G = nanoTime2;
            if (pVar == null || z11) {
                this.f16205u = f11;
            } else {
                if (this.f16180N) {
                    float interpolation2 = pVar.getInterpolation((nanoTime2 - this.f16158C) * 1.0E-9f);
                    p pVar2 = this.f16201s;
                    p113j0.b bVar = this.f16182O;
                    c10 = pVar2 == bVar ? bVar.f40984c.a() ? (char) 2 : (char) 1 : (char) 0;
                    this.f16164F = interpolation2;
                    this.f16166G = nanoTime2;
                    p pVar3 = this.f16201s;
                    if (pVar3 != null) {
                        float fA = pVar3.a();
                        this.f16205u = fA;
                        if (Math.abs(fA) * this.f16160D <= 1.0E-5f && c10 == 2) {
                            this.f16172J = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.f16164F = 1.0f;
                            this.f16172J = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f12 = interpolation2;
                        } else {
                            this.f16164F = 0.0f;
                            this.f16172J = false;
                            f12 = 0.0f;
                        }
                    } else {
                        f12 = interpolation2;
                    }
                } else {
                    float interpolation3 = pVar.getInterpolation(f12);
                    p pVar4 = this.f16201s;
                    if (pVar4 != null) {
                        this.f16205u = pVar4.a();
                    } else {
                        this.f16205u = ((pVar4.getInterpolation(f12 + f11) - interpolation3) * fSignum) / f11;
                    }
                    f12 = interpolation3;
                }
                if (Math.abs(this.f16205u) > 1.0E-5f) {
                    setState(TransitionState.f16218d);
                }
                transitionState = TransitionState.f16219e;
                if (c10 != 1) {
                    if ((fSignum <= 0.0f && f12 >= this.f16168H) || (fSignum <= 0.0f && f12 <= this.f16168H)) {
                        f12 = this.f16168H;
                        this.f16172J = false;
                    }
                    if (f12 < 1.0f || f12 <= 0.0f) {
                        this.f16172J = false;
                        setState(transitionState);
                    }
                }
                childCount = getChildCount();
                this.f16198q0 = false;
                nanoTime = getNanoTime();
                this.f16167G0 = f12;
                interpolator = this.f16203t;
                if (interpolator == null) {
                    interpolation = f12;
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                }
                interpolator2 = this.f16203t;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f16160D) + f12);
                    this.f16205u = interpolation4;
                    this.f16205u = interpolation4 - this.f16203t.getInterpolation(f12);
                }
                for (i10 = 0; i10 < childCount; i10++) {
                    childAt = getChildAt(i10);
                    nVar = this.f16156B.get(childAt);
                    if (nVar != null) {
                        this.f16198q0 = nVar.d(interpolation, nanoTime, this.f16169H0, childAt) | this.f16198q0;
                    }
                }
                boolean z14 = (fSignum <= 0.0f && f12 >= this.f16168H) || (fSignum <= 0.0f && f12 <= this.f16168H);
                if (!this.f16198q0 && !this.f16172J && z14) {
                    setState(transitionState);
                }
                if (this.f16215z0) {
                    requestLayout();
                }
                this.f16198q0 = (!z14) | this.f16198q0;
                if (f12 <= 0.0f || (i13 = this.f16207v) == -1 || this.f16208w == i13) {
                    z13 = false;
                } else {
                    this.f16208w = i13;
                    this.f16199r.b(i13).a(this);
                    setState(transitionState);
                    z13 = true;
                }
                if (f12 >= 1.0d) {
                    i11 = this.f16208w;
                    i12 = this.f16210x;
                    if (i11 != i12) {
                        this.f16208w = i12;
                        this.f16199r.b(i12).a(this);
                        setState(transitionState);
                        z13 = true;
                    }
                }
                if (!this.f16198q0 || this.f16172J) {
                    invalidate();
                } else if ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f)) {
                    setState(transitionState);
                }
                if (!this.f16198q0 && !this.f16172J && ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f))) {
                    y();
                }
            }
            c10 = 0;
            if (Math.abs(this.f16205u) > 1.0E-5f) {
                setState(TransitionState.f16218d);
            }
            transitionState = TransitionState.f16219e;
            if (c10 != 1) {
                if (fSignum <= 0.0f) {
                    f12 = this.f16168H;
                    this.f16172J = false;
                } else {
                    f12 = this.f16168H;
                    this.f16172J = false;
                }
                if (f12 < 1.0f) {
                    this.f16172J = false;
                    setState(transitionState);
                } else {
                    this.f16172J = false;
                    setState(transitionState);
                }
            }
            childCount = getChildCount();
            this.f16198q0 = false;
            nanoTime = getNanoTime();
            this.f16167G0 = f12;
            interpolator = this.f16203t;
            if (interpolator == null) {
                interpolation = f12;
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            interpolator2 = this.f16203t;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f16160D) + f12);
                this.f16205u = interpolation5;
                this.f16205u = interpolation5 - this.f16203t.getInterpolation(f12);
            }
            while (i10 < childCount) {
                childAt = getChildAt(i10);
                nVar = this.f16156B.get(childAt);
                if (nVar != null) {
                    this.f16198q0 = nVar.d(interpolation, nanoTime, this.f16169H0, childAt) | this.f16198q0;
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.f16198q0) {
                setState(transitionState);
            }
            if (this.f16215z0) {
                requestLayout();
            }
            this.f16198q0 = (!z14) | this.f16198q0;
            if (f12 <= 0.0f) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (f12 >= 1.0d) {
                i11 = this.f16208w;
                i12 = this.f16210x;
                if (i11 != i12) {
                    this.f16208w = i12;
                    this.f16199r.b(i12).a(this);
                    setState(transitionState);
                    z13 = true;
                }
            }
            if (this.f16198q0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f16198q0) {
                y();
            }
        }
        float f13 = this.f16164F;
        if (f13 < 1.0f) {
            if (f13 <= 0.0f) {
                int i14 = this.f16208w;
                int i15 = this.f16207v;
                z12 = i14 == i15 ? z13 : true;
                this.f16208w = i15;
            }
            this.f16185P0 |= z13;
            if (z13 && !this.f16171I0) {
                requestLayout();
            }
            this.f16162E = this.f16164F;
        }
        int i16 = this.f16208w;
        int i17 = this.f16210x;
        z12 = i16 == i17 ? z13 : true;
        this.f16208w = i17;
        z13 = z12;
        this.f16185P0 |= z13;
        if (z13) {
            requestLayout();
        }
        this.f16162E = this.f16164F;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return p126k0.a.c(context, this.f16207v) + "->" + p126k0.a.c(context, this.f16210x) + " (pos:" + this.f16164F + " Dpos/Dt:" + this.f16205u;
    }

    public final void u() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        CopyOnWriteArrayList<h> copyOnWriteArrayList2;
        if ((this.f16174K == null && ((copyOnWriteArrayList2 = this.f16204t0) == null || copyOnWriteArrayList2.isEmpty())) || this.f16213y0 == this.f16162E) {
            return;
        }
        if (this.f16211x0 != -1 && (copyOnWriteArrayList = this.f16204t0) != null) {
            Iterator<h> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        this.f16211x0 = -1;
        this.f16213y0 = this.f16162E;
        CopyOnWriteArrayList<h> copyOnWriteArrayList3 = this.f16204t0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<h> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    public final void v() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if ((this.f16174K != null || ((copyOnWriteArrayList = this.f16204t0) != null && !copyOnWriteArrayList.isEmpty())) && this.f16211x0 == -1) {
            this.f16211x0 = this.f16208w;
            ArrayList<Integer> arrayList = this.f16193T0;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) Z3.n.f(1, arrayList)).intValue() : -1;
            int i10 = this.f16208w;
            if (iIntValue != i10 && i10 != -1) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        z();
        I4.c cVar = this.f16175K0;
        if (cVar != null) {
            cVar.run();
            this.f16175K0 = null;
        }
    }

    public final void w(int i10, float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        HashMap<View, n> map = this.f16156B;
        View viewC = c(i10);
        n nVar = map.get(viewC);
        if (nVar == null) {
            if (viewC == null) {
                return;
            }
            viewC.getContext().getResources().getResourceName(i10);
            return;
        }
        float[] fArr2 = nVar.f41359v;
        float fA = nVar.a(f10, fArr2);
        p077g0.b[] bVarArr = nVar.j;
        int i11 = 0;
        if (bVarArr != null) {
            double d10 = fA;
            bVarArr[0].e(d10, nVar.f41354q);
            nVar.j[0].c(d10, nVar.f41353p);
            float f13 = fArr2[0];
            while (true) {
                dArr = nVar.f41354q;
                if (i11 >= dArr.length) {
                    break;
                }
                dArr[i11] = dArr[i11] * ((double) f13);
                i11++;
            }
            p077g0.a aVar = nVar.f41348k;
            if (aVar != null) {
                double[] dArr2 = nVar.f41353p;
                if (dArr2.length > 0) {
                    aVar.c(d10, dArr2);
                    nVar.f41348k.e(d10, nVar.f41354q);
                    int[] iArr = nVar.f41352o;
                    double[] dArr3 = nVar.f41354q;
                    double[] dArr4 = nVar.f41353p;
                    nVar.f41344f.getClass();
                    q.e(f11, f12, fArr, iArr, dArr3, dArr4);
                }
            } else {
                int[] iArr2 = nVar.f41352o;
                double[] dArr5 = nVar.f41353p;
                nVar.f41344f.getClass();
                q.e(f11, f12, fArr, iArr2, dArr, dArr5);
            }
        } else {
            q qVar = nVar.f41345g;
            float f14 = qVar.f41372f;
            q qVar2 = nVar.f41344f;
            float f15 = f14 - qVar2.f41372f;
            float f16 = qVar.f41373g - qVar2.f41373g;
            float f17 = qVar.f41374h - qVar2.f41374h;
            float f18 = (qVar.f41375i - qVar2.f41375i) + f16;
            fArr[0] = ((f17 + f15) * f11) + ((1.0f - f11) * f15);
            fArr[1] = (f18 * f12) + ((1.0f - f12) * f16);
        }
        viewC.getY();
    }

    public final boolean x(float f10, float f11, View view, MotionEvent motionEvent) {
        boolean z10;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z10 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z10 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (x((childAt.getLeft() + f10) - view.getScrollX(), (childAt.getTop() + f11) - view.getScrollY(), childAt, motionEvent)) {
                z10 = true;
                break;
            }
            childCount--;
        }
        if (!z10) {
            RectF rectF = this.f16187Q0;
            rectF.set(f10, f11, (view.getRight() + f10) - view.getLeft(), (view.getBottom() + f11) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f12 = -f10;
                float f13 = -f11;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f12, f13);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f12, -f13);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f12, f13);
                    if (this.f16191S0 == null) {
                        this.f16191S0 = new Matrix();
                    }
                    matrix.invert(this.f16191S0);
                    motionEventObtain.transform(this.f16191S0);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z10;
    }

    public final void y() {
        androidx.constraintlayout.motion.widget.a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        View viewFindViewById;
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        if (aVar == null) {
            return;
        }
        if (aVar.a(this.f16208w, this)) {
            requestLayout();
            return;
        }
        int i10 = this.f16208w;
        if (i10 != -1) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.f16199r;
            ArrayList<androidx.constraintlayout.motion.widget.a.b> arrayList = aVar2.f16257d;
            for (androidx.constraintlayout.motion.widget.a.b bVar3 : arrayList) {
                if (bVar3.f16284m.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.a.b.ViewOnClickListenerC0167a> it = bVar3.f16284m.iterator();
                    while (it.hasNext()) {
                        it.next().b(this);
                    }
                }
            }
            ArrayList<androidx.constraintlayout.motion.widget.a.b> arrayList2 = aVar2.f16259f;
            for (androidx.constraintlayout.motion.widget.a.b bVar4 : arrayList2) {
                if (bVar4.f16284m.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.a.b.ViewOnClickListenerC0167a> it2 = bVar4.f16284m.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(this);
                    }
                }
            }
            for (androidx.constraintlayout.motion.widget.a.b bVar5 : arrayList) {
                if (bVar5.f16284m.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.a.b.ViewOnClickListenerC0167a> it3 = bVar5.f16284m.iterator();
                    while (it3.hasNext()) {
                        it3.next().a(this, i10, bVar5);
                    }
                }
            }
            for (androidx.constraintlayout.motion.widget.a.b bVar6 : arrayList2) {
                if (bVar6.f16284m.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.a.b.ViewOnClickListenerC0167a> it4 = bVar6.f16284m.iterator();
                    while (it4.hasNext()) {
                        it4.next().a(this, i10, bVar6);
                    }
                }
            }
        }
        if (!this.f16199r.n() || (bVar = this.f16199r.f16256c) == null || (bVar2 = bVar.f16283l) == null) {
            return;
        }
        int i11 = bVar2.f16302d;
        if (i11 != -1) {
            MotionLayout motionLayout = bVar2.f16315r;
            viewFindViewById = motionLayout.findViewById(i11);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + p126k0.a.c(motionLayout.getContext(), bVar2.f16302d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new r());
            nestedScrollView.setOnScrollChangeListener(new s());
        }
    }

    public final void z() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if (this.f16174K == null && ((copyOnWriteArrayList = this.f16204t0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.f16193T0;
        for (Integer num : arrayList) {
            if (this.f16174K != null) {
                num.getClass();
            }
            CopyOnWriteArrayList<h> copyOnWriteArrayList2 = this.f16204t0;
            if (copyOnWriteArrayList2 != null) {
                for (h hVar : copyOnWriteArrayList2) {
                    num.getClass();
                    hVar.getClass();
                }
            }
        }
        arrayList.clear();
    }

    public void setTransition(androidx.constraintlayout.motion.widget.a.b bVar) {
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.f16199r;
        aVar.f16256c = bVar;
        if (bVar != null && (bVar2 = bVar.f16283l) != null) {
            bVar2.c(aVar.f16268p);
        }
        setState(TransitionState.f16217c);
        int i10 = this.f16208w;
        androidx.constraintlayout.motion.widget.a.b bVar3 = this.f16199r.f16256c;
        if (i10 == (bVar3 == null ? -1 : bVar3.f16275c)) {
            this.f16164F = 1.0f;
            this.f16162E = 1.0f;
            this.f16168H = 1.0f;
        } else {
            this.f16164F = 0.0f;
            this.f16162E = 0.0f;
            this.f16168H = 0.0f;
        }
        this.f16166G = (bVar.f16289r & 1) != 0 ? -1L : getNanoTime();
        int iG = this.f16199r.g();
        androidx.constraintlayout.motion.widget.a aVar2 = this.f16199r;
        androidx.constraintlayout.motion.widget.a.b bVar4 = aVar2.f16256c;
        int i11 = bVar4 != null ? bVar4.f16275c : -1;
        if (iG == this.f16207v && i11 == this.f16210x) {
            return;
        }
        this.f16207v = iG;
        this.f16210x = i11;
        aVar2.m(iG, i11);
        androidx.constraintlayout.widget.b bVarB = this.f16199r.b(this.f16207v);
        androidx.constraintlayout.widget.b bVarB2 = this.f16199r.b(this.f16210x);
        e eVar = this.f16183O0;
        eVar.e(bVarB, bVarB2);
        int i12 = this.f16207v;
        int i13 = this.f16210x;
        eVar.f16244e = i12;
        eVar.f16245f = i13;
        eVar.f();
        A();
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void l(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
