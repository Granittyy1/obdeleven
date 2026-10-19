package p113j0;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: ViewOscillator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends p077g0.e {

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class a extends c {
        @Override // p113j0.c
        public final void e(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class b extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float[] f40985g = new float[1];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ConstraintAttribute f40986h;

        @Override // p077g0.e
        public final void b(ConstraintAttribute constraintAttribute) {
            this.f40986h = constraintAttribute;
        }

        @Override // p113j0.c
        public final void e(View view, float f10) {
            float fA = a(f10);
            float[] fArr = this.f40985g;
            fArr[0] = fA;
            p113j0.a.b(this.f40986h, view, fArr);
        }
    }

    /* JADX INFO: renamed from: j0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class C0465c extends c {
        @Override // p113j0.c
        public final void e(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class e extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f40987g;

        @Override // p113j0.c
        public final void e(View view, float f10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
                return;
            }
            if (this.f40987g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f40987g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f10)));
                } catch (IllegalAccessException e10) {
                    Log.e("ViewOscillator", "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e("ViewOscillator", "unable to setProgress", e11);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class f extends c {
        @Override // p113j0.c
        public final void e(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class g extends c {
        @Override // p113j0.c
        public final void e(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class h extends c {
        @Override // p113j0.c
        public final void e(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class i extends c {
        @Override // p113j0.c
        public final void e(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class j extends c {
        @Override // p113j0.c
        public final void e(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class k extends c {
        @Override // p113j0.c
        public final void e(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class l extends c {
        @Override // p113j0.c
        public final void e(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class m extends c {
        @Override // p113j0.c
        public final void e(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public c() {
        this.f35112c = 0;
        this.f35113d = null;
        this.f35114e = 0;
        this.f35115f = new ArrayList<>();
    }

    public static c d(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
        switch (str) {
            case "rotationX":
                return new g();
            case "rotationY":
                return new h();
            case "translationX":
                return new k();
            case "translationY":
                return new l();
            case "translationZ":
                return new m();
            case "progress":
                e eVar = new e();
                eVar.f40987g = false;
                return eVar;
            case "scaleX":
                return new i();
            case "scaleY":
                return new j();
            case "waveVariesBy":
                return new a();
            case "rotation":
                return new f();
            case "elevation":
                return new C0465c();
            case "transitionPathRotate":
                return new d();
            case "alpha":
                return new a();
            case "waveOffset":
                return new a();
            default:
                return null;
        }
    }

    public abstract void e(View view, float f10);

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class d extends c {
        @Override // p113j0.c
        public final void e(View view, float f10) {
        }
    }
}
