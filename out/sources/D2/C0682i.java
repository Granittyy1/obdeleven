package D2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import com.voltasit.obdeleven.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: D2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChangeTransform.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0682i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f2665c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Matrix f2667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f2668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0681h.e f2669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0681h.d f2670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0681h f2671i;

    public C0682i(C0681h c0681h, boolean z10, Matrix matrix, View view, C0681h.e eVar, C0681h.d dVar) {
        this.f2671i = c0681h;
        this.f2666d = z10;
        this.f2667e = matrix;
        this.f2668f = view;
        this.f2669g = eVar;
        this.f2670h = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2664b = true;
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
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10 = this.f2664b;
        C0681h.e eVar = this.f2669g;
        View view = this.f2668f;
        if (!z10) {
            if (this.f2666d && this.f2671i.f2646E) {
                Matrix matrix = this.f2667e;
                Matrix matrix2 = this.f2665c;
                matrix2.set(matrix);
                view.setTag(R.id.transition_transform, matrix2);
                eVar.getClass();
                String[] strArr = C0681h.f2642H;
                view.setTranslationX(eVar.f2656a);
                view.setTranslationY(eVar.f2657b);
                WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
                androidx.core.view.O.d.w(view, eVar.f2658c);
                view.setScaleX(eVar.f2659d);
                view.setScaleY(eVar.f2660e);
                view.setRotationX(eVar.f2661f);
                view.setRotationY(eVar.f2662g);
                view.setRotation(eVar.f2663h);
            } else {
                view.setTag(R.id.transition_transform, null);
                view.setTag(R.id.parent_matrix, null);
            }
        }
        T.f2571a.v(view, null);
        eVar.getClass();
        String[] strArr2 = C0681h.f2642H;
        view.setTranslationX(eVar.f2656a);
        view.setTranslationY(eVar.f2657b);
        WeakHashMap<View, androidx.core.view.Z> weakHashMap2 = androidx.core.view.O.f16859a;
        androidx.core.view.O.d.w(view, eVar.f2658c);
        view.setScaleX(eVar.f2659d);
        view.setScaleY(eVar.f2660e);
        view.setRotationX(eVar.f2661f);
        view.setRotationY(eVar.f2662g);
        view.setRotation(eVar.f2663h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = this.f2670h.f2651a;
        Matrix matrix2 = this.f2665c;
        matrix2.set(matrix);
        View view = this.f2668f;
        view.setTag(R.id.transition_transform, matrix2);
        C0681h.e eVar = this.f2669g;
        eVar.getClass();
        String[] strArr = C0681h.f2642H;
        view.setTranslationX(eVar.f2656a);
        view.setTranslationY(eVar.f2657b);
        WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
        androidx.core.view.O.d.w(view, eVar.f2658c);
        view.setScaleX(eVar.f2659d);
        view.setScaleY(eVar.f2660e);
        view.setRotationX(eVar.f2661f);
        view.setRotationY(eVar.f2662g);
        view.setRotation(eVar.f2663h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f2668f;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
        androidx.core.view.O.d.w(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
