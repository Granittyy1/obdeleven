package D2;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashMap;

/* JADX INFO: renamed from: D2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChangeImageTransform.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0679f extends F {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f2635E = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final a f2636F = new a();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final b f2637G = new b(Matrix.class, "animatedTransform");

    /* JADX INFO: renamed from: D2.f$a */
    /* JADX INFO: compiled from: ChangeImageTransform.java */
    public static class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D2.f$b */
    /* JADX INFO: compiled from: ChangeImageTransform.java */
    public static class b extends Property<ImageView, Matrix> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            ImageView imageView2 = imageView;
            Matrix matrix2 = matrix;
            if (Build.VERSION.SDK_INT >= 29) {
                imageView2.animateTransform(matrix2);
                return;
            }
            if (matrix2 == null) {
                Drawable drawable = imageView2.getDrawable();
                if (drawable != null) {
                    drawable.setBounds(0, 0, (imageView2.getWidth() - imageView2.getPaddingLeft()) - imageView2.getPaddingRight(), (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom());
                    imageView2.invalidate();
                    return;
                }
                return;
            }
            if (C0695w.f2706a) {
                try {
                    imageView2.animateTransform(matrix2);
                } catch (NoSuchMethodError unused) {
                    C0695w.f2706a = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: D2.f$c */
    /* JADX INFO: compiled from: ChangeImageTransform.java */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2638a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f2638a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2638a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b9  */
    public static void O(O o10) {
        Matrix matrix;
        View view = o10.f2554b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = o10.f2553a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Drawable drawable = imageView.getDrawable();
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                matrix = new Matrix(imageView.getImageMatrix());
            } else {
                int i10 = c.f2638a[imageView.getScaleType().ordinal()];
                if (i10 == 1) {
                    Drawable drawable2 = imageView.getDrawable();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    matrix = matrix2;
                } else if (i10 != 2) {
                    matrix = new Matrix(imageView.getImageMatrix());
                } else {
                    Drawable drawable3 = imageView.getDrawable();
                    int intrinsicWidth = drawable3.getIntrinsicWidth();
                    float width = imageView.getWidth();
                    float f10 = intrinsicWidth;
                    int intrinsicHeight = drawable3.getIntrinsicHeight();
                    float height = imageView.getHeight();
                    float f11 = intrinsicHeight;
                    float fMax = Math.max(width / f10, height / f11);
                    int iRound = Math.round((width - (f10 * fMax)) / 2.0f);
                    int iRound2 = Math.round((height - (f11 * fMax)) / 2.0f);
                    matrix = new Matrix();
                    matrix.postScale(fMax, fMax);
                    matrix.postTranslate(iRound, iRound2);
                }
            }
            map.put("android:changeImageTransform:matrix", matrix);
        }
    }

    @Override // D2.F
    public final void g(O o10) {
        O(o10);
    }

    @Override // D2.F
    public final void j(O o10) {
        O(o10);
    }

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
    @Override // D2.F
    public final Animator o(ViewGroup viewGroup, O o10, O o11) {
        if (o10 != null && o11 != null) {
            HashMap map = o10.f2553a;
            Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
            HashMap map2 = o11.f2553a;
            Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
                boolean z10 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z10) {
                    return null;
                }
                ImageView imageView = (ImageView) o11.f2554b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                b bVar = f2637G;
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    a aVar = f2636F;
                    C0696x.a aVar2 = C0696x.f2707a;
                    return ObjectAnimator.ofObject(imageView, bVar, aVar, aVar2, aVar2);
                }
                if (matrix == null) {
                    matrix = C0696x.f2707a;
                }
                if (matrix2 == null) {
                    matrix2 = C0696x.f2707a;
                }
                bVar.set(imageView, matrix);
                return ObjectAnimator.ofObject(imageView, bVar, new N.a(), matrix, matrix2);
            }
        }
        return null;
    }

    @Override // D2.F
    public final String[] w() {
        return f2635E;
    }
}
