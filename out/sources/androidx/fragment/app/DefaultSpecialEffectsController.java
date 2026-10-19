package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.activity.C0845b;
import androidx.collection.C0873a;
import androidx.core.view.Z;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static final class TransitionEffect extends SpecialEffectsController.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f17386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SpecialEffectsController.Operation f17387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SpecialEffectsController.Operation f17388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final P f17389f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f17390g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayList<View> f17391h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ArrayList<View> f17392i;
        public final C0873a<String, String> j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ArrayList<String> f17393k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ArrayList<String> f17394l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final C0873a<String, View> f17395m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final C0873a<String, View> f17396n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f17397o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final p271w0.d f17398p = new p271w0.d();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f17399q;

        public TransitionEffect(ArrayList arrayList, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, P p10, Object obj, ArrayList arrayList2, ArrayList arrayList3, C0873a c0873a, ArrayList arrayList4, ArrayList arrayList5, C0873a c0873a2, C0873a c0873a3, boolean z10) {
            this.f17386c = arrayList;
            this.f17387d = operation;
            this.f17388e = operation2;
            this.f17389f = p10;
            this.f17390g = obj;
            this.f17391h = arrayList2;
            this.f17392i = arrayList3;
            this.j = c0873a;
            this.f17393k = arrayList4;
            this.f17394l = arrayList5;
            this.f17395m = c0873a2;
            this.f17396n = c0873a3;
            this.f17397o = z10;
        }

        public static void f(View view, ArrayList arrayList) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (androidx.core.view.U.b(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    f(childAt, arrayList);
                }
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final boolean a() {
            this.f17389f.i();
            return false;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void b(ViewGroup container) {
            kotlin.jvm.internal.i.e(container, "container");
            p271w0.d dVar = this.f17398p;
            synchronized (dVar) {
                try {
                    if (dVar.f47681a) {
                        return;
                    }
                    dVar.f47681a = true;
                    synchronized (dVar) {
                        dVar.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:50:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:52:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:55:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:58:0x01be A[LOOP:2: B:56:0x01b8->B:58:0x01be, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:61:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:63:0x01de  */
        /* JADX WARN: Code duplicated, block: B:66:0x01eb A[LOOP:3: B:64:0x01e5->B:66:0x01eb, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:69:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:71:0x020f  */
        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void c(final ViewGroup container) {
            TransitionEffect transitionEffect;
            ArrayList<View> arrayList;
            ArrayList<View> arrayList2;
            SpecialEffectsController.Operation operation;
            C0873a<String, String> c0873a = this.j;
            Object obj = this.f17390g;
            P p10 = this.f17389f;
            kotlin.jvm.internal.i.e(container, "container");
            boolean zIsLaidOut = container.isLaidOut();
            ArrayList<g> arrayList3 = this.f17386c;
            String str = "FragmentManager";
            if (!zIsLaidOut || this.f17399q) {
                for (g gVar : arrayList3) {
                    SpecialEffectsController.Operation operation2 = gVar.f17417a;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        transitionEffect = this;
                        if (transitionEffect.f17399q) {
                            Objects.toString(operation2);
                        } else {
                            container.toString();
                            Objects.toString(operation2);
                        }
                    } else {
                        transitionEffect = this;
                    }
                    gVar.f17417a.c(transitionEffect);
                }
                this.f17399q = false;
                return;
            }
            final SpecialEffectsController.Operation operation3 = this.f17388e;
            final SpecialEffectsController.Operation operation4 = this.f17387d;
            View view = new View(container.getContext());
            Rect rect = new Rect();
            Iterator it = arrayList3.iterator();
            View view2 = null;
            boolean z10 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f17392i;
                arrayList2 = this.f17391h;
                if (!zHasNext) {
                    break;
                }
                if (((g) it.next()).f17420d == null || operation4 == null || operation3 == null || c0873a.isEmpty() || obj == null) {
                    it = it;
                    view2 = view2;
                } else {
                    C0873a<String, View> c0873a2 = this.f17395m;
                    Iterator it2 = it;
                    View view3 = view2;
                    J.a(operation3.f17542c, operation4.f17542c, this.f17397o, c0873a2);
                    androidx.core.view.B.a(container, new Runnable() { // from class: androidx.fragment.app.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect this$0 = this;
                            kotlin.jvm.internal.i.e(this$0, "this$0");
                            J.a(operation3.f17542c, operation4.f17542c, this$0.f17397o, this$0.f17396n);
                        }
                    });
                    arrayList2.addAll(c0873a2.values());
                    ArrayList<String> arrayList4 = this.f17394l;
                    if (arrayList4.isEmpty()) {
                        view2 = view3;
                    } else {
                        String str2 = arrayList4.get(0);
                        kotlin.jvm.internal.i.d(str2, "exitingNames[0]");
                        View view4 = c0873a2.get(str2);
                        p10.n(view4, obj);
                        view2 = view4;
                    }
                    C0873a<String, View> c0873a3 = this.f17396n;
                    arrayList.addAll(c0873a3.values());
                    ArrayList<String> arrayList5 = this.f17393k;
                    if (!arrayList5.isEmpty()) {
                        String str3 = arrayList5.get(0);
                        kotlin.jvm.internal.i.d(str3, "enteringNames[0]");
                        View view5 = c0873a3.get(str3);
                        if (view5 != null) {
                            androidx.core.view.B.a(container, new RunnableC1340e(p10, view5, rect, 0));
                            z10 = true;
                        }
                    }
                    p10.q(obj, view, arrayList2);
                    P p11 = this.f17389f;
                    Object obj2 = this.f17390g;
                    p11.m(obj2, null, null, obj2, arrayList);
                    it = it2;
                }
                c0873a = c0873a;
            }
            C0873a<String, String> c0873a4 = c0873a;
            View view6 = view2;
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            Object objK = null;
            Object objK2 = null;
            while (it3.hasNext()) {
                it3 = it3;
                g gVar2 = (g) it3.next();
                arrayList3 = arrayList3;
                SpecialEffectsController.Operation operation5 = gVar2.f17417a;
                Object obj3 = objK2;
                Object objF = p10.f(gVar2.f17418b);
                if (objF != null) {
                    Object obj4 = objK;
                    ArrayList<View> arrayList7 = new ArrayList<>();
                    View view7 = operation5.f17542c.mView;
                    String str4 = str;
                    kotlin.jvm.internal.i.d(view7, "operation.fragment.mView");
                    f(view7, arrayList7);
                    if (obj != null && (operation5 == operation4 || operation5 == operation3)) {
                        if (operation5 == operation4) {
                            arrayList7.removeAll(kotlin.collections.q.s0(arrayList2));
                        } else {
                            arrayList7.removeAll(kotlin.collections.q.s0(arrayList));
                        }
                    }
                    if (arrayList7.isEmpty()) {
                        p10.a(view, objF);
                    } else {
                        p10.b(objF, arrayList7);
                        this.f17389f.m(objF, objF, arrayList7, null, null);
                        if (operation5.f17540a == SpecialEffectsController.Operation.State.f17556d) {
                            operation5.f17548i = false;
                            ArrayList<View> arrayList8 = new ArrayList<>(arrayList7);
                            Fragment fragment = operation5.f17542c;
                            arrayList8.remove(fragment.mView);
                            p10.l(objF, fragment.mView, arrayList8);
                            androidx.core.view.B.a(container, new RunnableC1341f(0, arrayList7));
                        }
                        if (operation5.f17540a == SpecialEffectsController.Operation.State.f17555c) {
                            arrayList6.addAll(arrayList7);
                            if (z10) {
                                p10.o(objF, rect);
                            }
                            str = str4;
                            if (Log.isLoggable(str, 2)) {
                                objF.toString();
                                for (View transitioningViews : arrayList7) {
                                    kotlin.jvm.internal.i.d(transitioningViews, "transitioningViews");
                                    transitioningViews.toString();
                                }
                            }
                            view6 = view6;
                        } else {
                            view6 = view6;
                            str = str4;
                            p10.n(view6, objF);
                            if (Log.isLoggable(str, 2)) {
                                objF.toString();
                                for (View transitioningViews2 : arrayList7) {
                                    kotlin.jvm.internal.i.d(transitioningViews2, "transitioningViews");
                                    transitioningViews2.toString();
                                }
                            }
                        }
                        if (gVar2.f17419c) {
                            objK = p10.k(obj4, objF);
                            objK2 = obj3;
                        } else {
                            objK = obj4;
                            objK2 = p10.k(obj3, objF);
                        }
                        arrayList = arrayList;
                    }
                    if (operation5.f17540a == SpecialEffectsController.Operation.State.f17555c) {
                        arrayList6.addAll(arrayList7);
                        if (z10) {
                            p10.o(objF, rect);
                        }
                        str = str4;
                        if (Log.isLoggable(str, 2)) {
                            objF.toString();
                            while (r6.hasNext()) {
                                kotlin.jvm.internal.i.d(transitioningViews, "transitioningViews");
                                transitioningViews.toString();
                            }
                        }
                        view6 = view6;
                    } else {
                        view6 = view6;
                        str = str4;
                        p10.n(view6, objF);
                        if (Log.isLoggable(str, 2)) {
                            objF.toString();
                            while (r7.hasNext()) {
                                kotlin.jvm.internal.i.d(transitioningViews2, "transitioningViews");
                                transitioningViews2.toString();
                            }
                        }
                    }
                    if (gVar2.f17419c) {
                        objK = p10.k(obj4, objF);
                        objK2 = obj3;
                    } else {
                        objK = obj4;
                        objK2 = p10.k(obj3, objF);
                    }
                    arrayList = arrayList;
                } else {
                    objK2 = obj3;
                    arrayList3 = arrayList3;
                    it3 = it3;
                }
            }
            ArrayList arrayList9 = arrayList3;
            String str5 = str;
            Object objJ = p10.j(objK, objK2, obj);
            if (Log.isLoggable(str5, 2)) {
                Objects.toString(objJ);
                container.toString();
            }
            Pair pair = new Pair(arrayList6, objJ);
            ArrayList arrayList10 = (ArrayList) pair.a();
            final Object objB = pair.b();
            ArrayList<SpecialEffectsController.Operation> arrayList11 = new ArrayList(kotlin.collections.m.y(arrayList9, 10));
            Iterator it4 = arrayList9.iterator();
            while (it4.hasNext()) {
                arrayList11.add(((g) it4.next()).f17417a);
            }
            for (SpecialEffectsController.Operation operation6 : arrayList11) {
                Fragment fragment2 = operation6.f17542c;
                p10.p(new E7.d(operation6, 2, this), objB);
            }
            Ia.a<p293xa.r> aVar = new Ia.a<p293xa.r>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    this.this$0.f17389f.c(container, objB);
                    return p293xa.r.f47939a;
                }
            };
            J.c(4, arrayList10);
            p10.getClass();
            ArrayList arrayList12 = new ArrayList();
            ArrayList<View> arrayList13 = this.f17392i;
            int size = arrayList13.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view8 = arrayList13.get(i10);
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                arrayList12.add(androidx.core.view.O.d.k(view8));
                androidx.core.view.O.d.v(view8, null);
            }
            boolean zIsLoggable = Log.isLoggable(str5, 2);
            ArrayList<View> arrayList14 = this.f17391h;
            if (zIsLoggable) {
                for (View sharedElementFirstOutViews : arrayList14) {
                    kotlin.jvm.internal.i.d(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view9 = sharedElementFirstOutViews;
                    view9.toString();
                    WeakHashMap<View, Z> weakHashMap2 = androidx.core.view.O.f16859a;
                    androidx.core.view.O.d.k(view9);
                }
                for (View sharedElementLastInViews : arrayList13) {
                    kotlin.jvm.internal.i.d(sharedElementLastInViews, "sharedElementLastInViews");
                    View view10 = sharedElementLastInViews;
                    view10.toString();
                    WeakHashMap<View, Z> weakHashMap3 = androidx.core.view.O.f16859a;
                    androidx.core.view.O.d.k(view10);
                }
            }
            aVar.invoke();
            int size2 = arrayList13.size();
            ArrayList arrayList15 = new ArrayList();
            int i11 = 0;
            while (i11 < size2) {
                View view11 = arrayList14.get(i11);
                WeakHashMap<View, Z> weakHashMap4 = androidx.core.view.O.f16859a;
                String strK = androidx.core.view.O.d.k(view11);
                arrayList15.add(strK);
                if (strK == null) {
                    operation = operation3;
                    break;
                }
                androidx.core.view.O.d.v(view11, null);
                C0873a<String, String> c0873a5 = c0873a4;
                String str6 = c0873a5.get(strK);
                c0873a4 = c0873a5;
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        operation = operation3;
                        break;
                    }
                    operation = operation3;
                    if (str6.equals(arrayList12.get(i12))) {
                        androidx.core.view.O.d.v(arrayList13.get(i12), strK);
                        break;
                    } else {
                        i12++;
                        operation3 = operation;
                    }
                }
                i11++;
                operation3 = operation;
            }
            SpecialEffectsController.Operation operation7 = operation3;
            androidx.core.view.B.a(container, new O(size2, arrayList13, arrayList12, arrayList14, arrayList15));
            J.c(0, arrayList10);
            p10.r(obj, arrayList14, arrayList13);
            if (Log.isLoggable(str5, 2)) {
                Objects.toString(operation4);
                Objects.toString(operation7);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void d(C0845b backEvent, ViewGroup container) {
            kotlin.jvm.internal.i.e(backEvent, "backEvent");
            kotlin.jvm.internal.i.e(container, "container");
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void e(ViewGroup container) {
            Object obj;
            kotlin.jvm.internal.i.e(container, "container");
            boolean zIsLaidOut = container.isLaidOut();
            ArrayList arrayList = this.f17386c;
            if (!zIsLaidOut) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((g) it.next()).f17417a;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        container.toString();
                        Objects.toString(operation);
                    }
                }
                return;
            }
            ArrayList arrayList2 = this.f17386c;
            boolean z10 = true;
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (!((g) it2.next()).f17417a.f17542c.mTransitioning) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && (obj = this.f17390g) != null) {
                a();
                Objects.toString(obj);
                Objects.toString(this.f17387d);
                Objects.toString(this.f17388e);
            }
            a();
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static final class a extends SpecialEffectsController.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f17400c;

        /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
        public static final class AnimationAnimationListenerC0182a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SpecialEffectsController.Operation f17401a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f17402b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f17403c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f17404d;

            public AnimationAnimationListenerC0182a(SpecialEffectsController.Operation operation, ViewGroup viewGroup, View view, a aVar) {
                this.f17401a = operation;
                this.f17402b = viewGroup;
                this.f17403c = view;
                this.f17404d = aVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                kotlin.jvm.internal.i.e(animation, "animation");
                ViewGroup viewGroup = this.f17402b;
                viewGroup.post(new K2.q(viewGroup, this.f17403c, this.f17404d, 1));
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(this.f17401a);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                kotlin.jvm.internal.i.e(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                kotlin.jvm.internal.i.e(animation, "animation");
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(this.f17401a);
                }
            }
        }

        public a(b bVar) {
            this.f17400c = bVar;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void b(ViewGroup container) {
            kotlin.jvm.internal.i.e(container, "container");
            b bVar = this.f17400c;
            SpecialEffectsController.Operation operation = bVar.f17417a;
            View view = operation.f17542c.mView;
            view.clearAnimation();
            container.endViewTransition(view);
            bVar.f17417a.c(this);
            if (Log.isLoggable("FragmentManager", 2)) {
                operation.toString();
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void c(ViewGroup container) {
            kotlin.jvm.internal.i.e(container, "container");
            b bVar = this.f17400c;
            if (bVar.a()) {
                bVar.f17417a.c(this);
                return;
            }
            Context context = container.getContext();
            SpecialEffectsController.Operation operation = bVar.f17417a;
            View view = operation.f17542c.mView;
            kotlin.jvm.internal.i.d(context, "context");
            C1348m.a aVarB = bVar.b(context);
            if (aVarB == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarB.f17622a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.f17540a != SpecialEffectsController.Operation.State.f17554b) {
                view.startAnimation(animation);
                bVar.f17417a.c(this);
                return;
            }
            container.startViewTransition(view);
            C1348m.b bVar2 = new C1348m.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0182a(operation, container, view, this));
            view.startAnimation(bVar2);
            if (Log.isLoggable("FragmentManager", 2)) {
                operation.toString();
            }
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static final class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f17405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C1348m.a f17407d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SpecialEffectsController.Operation operation, boolean z10) {
            super(operation);
            kotlin.jvm.internal.i.e(operation, "operation");
            this.f17405b = z10;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0056  */
        /* JADX WARN: Code duplicated, block: B:73:0x00f7 A[Catch: RuntimeException -> 0x00fd, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00fd, blocks: (B:71:0x00f1, B:73:0x00f7), top: B:84:0x00f1 }] */
        public final C1348m.a b(Context context) {
            int enterAnim;
            C1348m.a aVar;
            C1348m.a aVar2;
            Animator animatorLoadAnimator;
            int iA;
            if (this.f17406c) {
                return this.f17407d;
            }
            SpecialEffectsController.Operation operation = this.f17417a;
            Fragment fragment = operation.f17542c;
            boolean z10 = operation.f17540a == SpecialEffectsController.Operation.State.f17555c;
            int nextTransition = fragment.getNextTransition();
            if (this.f17405b) {
                enterAnim = z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
            } else {
                enterAnim = z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, enterAnim);
                if (animationOnCreateAnimation != null) {
                    aVar2 = new C1348m.a(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        aVar2 = new C1348m.a(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iA = z10 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            } else if (nextTransition == 8194) {
                                iA = z10 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            } else if (nextTransition == 8197) {
                                iA = z10 ? C1348m.a(context, android.R.attr.activityCloseEnterAnimation) : C1348m.a(context, android.R.attr.activityCloseExitAnimation);
                            } else if (nextTransition == 4099) {
                                iA = z10 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                iA = -1;
                            } else {
                                iA = z10 ? C1348m.a(context, android.R.attr.activityOpenEnterAnimation) : C1348m.a(context, android.R.attr.activityOpenExitAnimation);
                            }
                            enterAnim = iA;
                        }
                        if (enterAnim == 0) {
                            aVar2 = null;
                        } else {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                            if (zEquals) {
                                try {
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation != null) {
                                        aVar = new C1348m.a(animationLoadAnimation);
                                        aVar2 = aVar;
                                    } else {
                                        aVar2 = null;
                                    }
                                } catch (Resources.NotFoundException e10) {
                                    throw e10;
                                } catch (RuntimeException unused) {
                                    try {
                                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                        if (animatorLoadAnimator != null) {
                                            aVar = new C1348m.a(animatorLoadAnimator);
                                            aVar2 = aVar;
                                        }
                                    } catch (RuntimeException e11) {
                                        if (zEquals) {
                                            throw e11;
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                        if (animationLoadAnimation2 != null) {
                                            aVar2 = new C1348m.a(animationLoadAnimation2);
                                        }
                                        this.f17407d = aVar2;
                                        this.f17406c = true;
                                        return aVar2;
                                    }
                                    this.f17407d = aVar2;
                                    this.f17406c = true;
                                    return aVar2;
                                }
                            } else {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                if (animatorLoadAnimator != null) {
                                    aVar = new C1348m.a(animatorLoadAnimator);
                                    aVar2 = aVar;
                                } else {
                                    aVar2 = null;
                                }
                            }
                        }
                    }
                }
            } else {
                aVar2 = null;
            }
            this.f17407d = aVar2;
            this.f17406c = true;
            return aVar2;
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static final class c extends SpecialEffectsController.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f17408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AnimatorSet f17409d;

        /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f17410b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f17411c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f17412d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ SpecialEffectsController.Operation f17413e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ c f17414f;

            public a(ViewGroup viewGroup, View view, boolean z10, SpecialEffectsController.Operation operation, c cVar) {
                this.f17410b = viewGroup;
                this.f17411c = view;
                this.f17412d = z10;
                this.f17413e = operation;
                this.f17414f = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator anim) {
                kotlin.jvm.internal.i.e(anim, "anim");
                ViewGroup viewGroup = this.f17410b;
                View viewToAnimate = this.f17411c;
                viewGroup.endViewTransition(viewToAnimate);
                boolean z10 = this.f17412d;
                SpecialEffectsController.Operation operation = this.f17413e;
                if (z10) {
                    SpecialEffectsController.Operation.State state = operation.f17540a;
                    kotlin.jvm.internal.i.d(viewToAnimate, "viewToAnimate");
                    state.a(viewToAnimate, viewGroup);
                }
                c cVar = this.f17414f;
                cVar.f17408c.f17417a.c(cVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(operation);
                }
            }
        }

        public c(b bVar) {
            this.f17408c = bVar;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void b(ViewGroup container) {
            kotlin.jvm.internal.i.e(container, "container");
            AnimatorSet animatorSet = this.f17409d;
            b bVar = this.f17408c;
            if (animatorSet == null) {
                bVar.f17417a.c(this);
                return;
            }
            SpecialEffectsController.Operation operation = bVar.f17417a;
            if (operation.f17546g) {
                e.f17416a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                operation.toString();
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void c(ViewGroup container) {
            kotlin.jvm.internal.i.e(container, "container");
            SpecialEffectsController.Operation operation = this.f17408c.f17417a;
            AnimatorSet animatorSet = this.f17409d;
            if (animatorSet == null) {
                operation.c(this);
                return;
            }
            animatorSet.start();
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(operation);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void d(C0845b backEvent, ViewGroup container) {
            kotlin.jvm.internal.i.e(backEvent, "backEvent");
            kotlin.jvm.internal.i.e(container, "container");
            SpecialEffectsController.Operation operation = this.f17408c.f17417a;
            AnimatorSet animatorSet = this.f17409d;
            if (animatorSet == null) {
                operation.c(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.f17542c.mTransitioning) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                operation.toString();
            }
            long jA = d.f17415a.a(animatorSet);
            long j = (long) (backEvent.f8201c * jA);
            if (j == 0) {
                j = 1;
            }
            if (j == jA) {
                j = jA - 1;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                animatorSet.toString();
                operation.toString();
            }
            e.f17416a.b(animatorSet, j);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.a
        public final void e(ViewGroup container) {
            kotlin.jvm.internal.i.e(container, "container");
            b bVar = this.f17408c;
            if (bVar.a()) {
                return;
            }
            Context context = container.getContext();
            kotlin.jvm.internal.i.d(context, "context");
            C1348m.a aVarB = bVar.b(context);
            this.f17409d = aVarB != null ? aVarB.f17623b : null;
            SpecialEffectsController.Operation operation = bVar.f17417a;
            Fragment fragment = operation.f17542c;
            boolean z10 = operation.f17540a == SpecialEffectsController.Operation.State.f17556d;
            View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f17409d;
            if (animatorSet != null) {
                animatorSet.addListener(new a(container, view, z10, operation, this));
            }
            AnimatorSet animatorSet2 = this.f17409d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f17415a = new d();

        public final long a(AnimatorSet animatorSet) {
            kotlin.jvm.internal.i.e(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f17416a = new e();

        public final void a(AnimatorSet animatorSet) {
            kotlin.jvm.internal.i.e(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j) {
            kotlin.jvm.internal.i.e(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j);
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpecialEffectsController.Operation f17417a;

        public f(SpecialEffectsController.Operation operation) {
            kotlin.jvm.internal.i.e(operation, "operation");
            this.f17417a = operation;
        }

        public final boolean a() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation operation = this.f17417a;
            View view = operation.f17542c.mView;
            SpecialEffectsController.Operation.State stateA = view != null ? SpecialEffectsController.Operation.State.a.a(view) : null;
            SpecialEffectsController.Operation.State state2 = operation.f17540a;
            return stateA == state2 || !(stateA == (state = SpecialEffectsController.Operation.State.f17555c) || state2 == state);
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    public static final class g extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f17418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f17419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f17420d;

        public g(SpecialEffectsController.Operation operation, boolean z10, boolean z11) {
            super(operation);
            SpecialEffectsController.Operation.State state = operation.f17540a;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.f17555c;
            Fragment fragment = operation.f17542c;
            this.f17418b = state == state2 ? z10 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z10 ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.f17419c = operation.f17540a == state2 ? z10 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.f17420d = z11 ? z10 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        public final P b() {
            Object obj = this.f17418b;
            P pC = c(obj);
            Object obj2 = this.f17420d;
            P pC2 = c(obj2);
            if (pC == null || pC2 == null || pC == pC2) {
                return pC == null ? pC2 : pC;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f17417a.f17542c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final P c(Object obj) {
            if (obj == null) {
                return null;
            }
            L l10 = J.f17509a;
            if (l10 != null && (obj instanceof Transition)) {
                return l10;
            }
            P p10 = J.f17510b;
            if (p10 != null && p10.e(obj)) {
                return p10;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f17417a.f17542c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static void n(C0873a c0873a, View view) {
        WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
        String strK = androidx.core.view.O.d.k(view);
        if (strK != null) {
            c0873a.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    n(c0873a, childAt);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x044c A[LOOP:19: B:156:0x0446->B:158:0x044c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.SpecialEffectsController
    public final void b(ArrayList arrayList, boolean z10) {
        SpecialEffectsController.Operation.State state;
        Object next;
        Object objPrevious;
        boolean z11;
        TransitionEffect transitionEffect;
        ArrayList<b> arrayList2;
        Iterator it;
        String strB;
        String str;
        z10 = z10;
        boolean z12 = true;
        String str2 = "FragmentManager";
        Log.isLoggable("FragmentManager", 2);
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            state = SpecialEffectsController.Operation.State.f17555c;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it2.next();
            SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) next;
            View view = operation.f17542c.mView;
            kotlin.jvm.internal.i.d(view, "operation.fragment.mView");
            if (SpecialEffectsController.Operation.State.a.a(view) == state && operation.f17540a != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) objPrevious;
            View view2 = operation3.f17542c.mView;
            kotlin.jvm.internal.i.d(view2, "operation.fragment.mView");
            if (SpecialEffectsController.Operation.State.a.a(view2) != state && operation3.f17540a == state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) objPrevious;
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(operation2);
            Objects.toString(operation4);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Fragment fragment = ((SpecialEffectsController.Operation) kotlin.collections.q.V(arrayList)).f17542c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Fragment.k kVar = ((SpecialEffectsController.Operation) it3.next()).f17542c.mAnimationInfo;
            Fragment.k kVar2 = fragment.mAnimationInfo;
            kVar.f17450b = kVar2.f17450b;
            kVar.f17451c = kVar2.f17451c;
            kVar.f17452d = kVar2.f17452d;
            kVar.f17453e = kVar2.f17453e;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            SpecialEffectsController.Operation operation5 = (SpecialEffectsController.Operation) it4.next();
            arrayList3.add(new b(operation5, z10));
            arrayList4.add(new g(operation5, z10, !z10 ? operation5 != operation4 : operation5 != operation2));
            operation5.f17543d.add(new L2.d(this, 1, operation5));
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : arrayList4) {
            if (!((g) obj).a()) {
                arrayList5.add(obj);
            }
        }
        ArrayList<g> arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            if (((g) obj2).b() != null) {
                arrayList6.add(obj2);
            }
        }
        P p10 = null;
        for (g gVar : arrayList6) {
            P pB = gVar.b();
            if (p10 != null && pB != p10) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + gVar.f17417a.f17542c + " returned Transition " + gVar.f17418b + " which uses a different Transition type than other Fragments.").toString());
            }
            p10 = pB;
        }
        if (p10 == null) {
            arrayList2 = arrayList3;
            z11 = true;
        } else {
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            C0873a c0873a = new C0873a();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList arrayList10 = new ArrayList();
            C0873a c0873a2 = new C0873a();
            C0873a c0873a3 = new C0873a();
            Iterator it5 = arrayList6.iterator();
            ArrayList<String> sharedElementTargetNames = arrayList9;
            ArrayList<String> sharedElementSourceNames = arrayList10;
            Object objS = null;
            while (it5.hasNext()) {
                Object obj3 = ((g) it5.next()).f17420d;
                if (obj3 == null || operation2 == null || operation4 == null) {
                    z10 = z10;
                    z12 = z12;
                    arrayList3 = arrayList3;
                    p10 = p10;
                    arrayList6 = arrayList6;
                    arrayList8 = arrayList8;
                    arrayList7 = arrayList7;
                } else {
                    objS = p10.s(p10.f(obj3));
                    Fragment fragment2 = operation4.f17542c;
                    sharedElementSourceNames = fragment2.getSharedElementSourceNames();
                    kotlin.jvm.internal.i.d(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    Fragment fragment3 = operation2.f17542c;
                    arrayList3 = arrayList3;
                    ArrayList<String> sharedElementSourceNames2 = fragment3.getSharedElementSourceNames();
                    kotlin.jvm.internal.i.d(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames2 = fragment3.getSharedElementTargetNames();
                    p10 = p10;
                    kotlin.jvm.internal.i.d(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames2.size();
                    arrayList6 = arrayList6;
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i10));
                        ArrayList<String> arrayList11 = sharedElementTargetNames2;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i10));
                        }
                        i10++;
                        size = i11;
                        sharedElementTargetNames2 = arrayList11;
                    }
                    sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                    kotlin.jvm.internal.i.d(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                    Pair pair = !z10 ? new Pair(fragment3.getExitTransitionCallback(), fragment2.getEnterTransitionCallback()) : new Pair(fragment3.getEnterTransitionCallback(), fragment2.getExitTransitionCallback());
                    androidx.core.app.I i12 = (androidx.core.app.I) pair.a();
                    androidx.core.app.I i13 = (androidx.core.app.I) pair.b();
                    int size2 = sharedElementSourceNames.size();
                    arrayList8 = arrayList8;
                    int i14 = 0;
                    while (true) {
                        arrayList7 = arrayList7;
                        if (i14 >= size2) {
                            break;
                        }
                        int i15 = size2;
                        Object obj4 = sharedElementSourceNames.get(i14);
                        kotlin.jvm.internal.i.d(obj4, "exitingNames[i]");
                        String str3 = sharedElementTargetNames.get(i14);
                        kotlin.jvm.internal.i.d(str3, "enteringNames[i]");
                        c0873a.put((String) obj4, str3);
                        i14++;
                        size2 = i15;
                        arrayList7 = arrayList7;
                    }
                    if (Log.isLoggable("FragmentManager", 2)) {
                        for (String str4 : sharedElementTargetNames) {
                        }
                        for (String str5 : sharedElementSourceNames) {
                        }
                    }
                    View view3 = fragment3.mView;
                    kotlin.jvm.internal.i.d(view3, "firstOut.fragment.mView");
                    n(c0873a2, view3);
                    c0873a2.p(sharedElementSourceNames);
                    if (i12 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            operation2.toString();
                        }
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i16 = size3 - 1;
                                Object obj5 = sharedElementSourceNames.get(size3);
                                kotlin.jvm.internal.i.d(obj5, "exitingNames[i]");
                                String str6 = (String) obj5;
                                View view4 = (View) c0873a2.get(str6);
                                if (view4 == null) {
                                    c0873a.remove(str6);
                                } else {
                                    WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                                    if (!str6.equals(androidx.core.view.O.d.k(view4))) {
                                        c0873a.put(androidx.core.view.O.d.k(view4), (String) c0873a.remove(str6));
                                    }
                                }
                                if (i16 < 0) {
                                    break;
                                } else {
                                    size3 = i16;
                                }
                            }
                        }
                    } else {
                        c0873a.p(c0873a2.keySet());
                    }
                    View view5 = fragment2.mView;
                    kotlin.jvm.internal.i.d(view5, "lastIn.fragment.mView");
                    n(c0873a3, view5);
                    c0873a3.p(sharedElementTargetNames);
                    c0873a3.p(c0873a.values());
                    if (i13 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            operation4.toString();
                        }
                        int size4 = sharedElementTargetNames.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i17 = size4 - 1;
                                String str7 = sharedElementTargetNames.get(size4);
                                kotlin.jvm.internal.i.d(str7, "enteringNames[i]");
                                String str8 = str7;
                                View view6 = (View) c0873a3.get(str8);
                                if (view6 == null) {
                                    String strB2 = J.b(c0873a, str8);
                                    if (strB2 != null) {
                                        c0873a.remove(strB2);
                                    }
                                } else {
                                    WeakHashMap<View, Z> weakHashMap2 = androidx.core.view.O.f16859a;
                                    if (!str8.equals(androidx.core.view.O.d.k(view6)) && (strB = J.b(c0873a, str8)) != null) {
                                        c0873a.put(strB, androidx.core.view.O.d.k(view6));
                                    }
                                }
                                if (i17 < 0) {
                                    break;
                                } else {
                                    size4 = i17;
                                }
                            }
                        }
                        z12 = true;
                    } else {
                        L l10 = J.f17509a;
                        z12 = true;
                        for (int i18 = c0873a.f9139d - 1; -1 < i18; i18--) {
                            if (!c0873a3.containsKey((String) c0873a.m(i18))) {
                                c0873a.k(i18);
                            }
                        }
                    }
                    final Set setKeySet = c0873a.keySet();
                    kotlin.collections.p.B(c0873a2.entrySet(), new Ia.l<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final Boolean invoke(Map.Entry<String, View> entry) {
                            Map.Entry<String, View> entry2 = entry;
                            kotlin.jvm.internal.i.e(entry2, "entry");
                            Collection<String> collection = setKeySet;
                            View value = entry2.getValue();
                            WeakHashMap<View, Z> weakHashMap3 = androidx.core.view.O.f16859a;
                            return Boolean.valueOf(kotlin.collections.q.J(collection, androidx.core.view.O.d.k(value)));
                        }
                    }, false);
                    final Collection collectionValues = c0873a.values();
                    kotlin.collections.p.B(c0873a3.entrySet(), new Ia.l<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final Boolean invoke(Map.Entry<String, View> entry) {
                            Map.Entry<String, View> entry2 = entry;
                            kotlin.jvm.internal.i.e(entry2, "entry");
                            Collection<String> collection = collectionValues;
                            View value = entry2.getValue();
                            WeakHashMap<View, Z> weakHashMap3 = androidx.core.view.O.f16859a;
                            return Boolean.valueOf(kotlin.collections.q.J(collection, androidx.core.view.O.d.k(value)));
                        }
                    }, false);
                    if (c0873a.isEmpty()) {
                        Objects.toString(objS);
                        operation2.toString();
                        operation4.toString();
                        arrayList7.clear();
                        arrayList8.clear();
                        objS = null;
                    }
                }
            }
            P p11 = p10;
            ArrayList arrayList12 = arrayList7;
            ArrayList arrayList13 = arrayList8;
            ArrayList arrayList14 = arrayList6;
            ArrayList arrayList15 = arrayList3;
            z11 = z12;
            if (objS != null) {
                arrayList2 = arrayList15;
                transitionEffect = new TransitionEffect(arrayList14, operation2, operation4, p11, objS, arrayList12, arrayList13, c0873a, sharedElementTargetNames, sharedElementSourceNames, c0873a2, c0873a3, z10);
                it = arrayList14.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).f17417a.j.add(transitionEffect);
                }
            } else {
                if (!arrayList14.isEmpty()) {
                    Iterator it6 = arrayList14.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            if (((g) it6.next()).f17418b != null) {
                                arrayList2 = arrayList15;
                                transitionEffect = new TransitionEffect(arrayList14, operation2, operation4, p11, objS, arrayList12, arrayList13, c0873a, sharedElementTargetNames, sharedElementSourceNames, c0873a2, c0873a3, z10);
                                it = arrayList14.iterator();
                                while (it.hasNext()) {
                                    ((g) it.next()).f17417a.j.add(transitionEffect);
                                }
                            }
                        }
                    }
                }
                arrayList2 = arrayList15;
            }
        }
        ArrayList<b> arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            kotlin.collections.p.z(arrayList17, ((b) it7.next()).f17417a.f17549k);
        }
        boolean zIsEmpty = arrayList17.isEmpty();
        boolean z13 = false;
        for (b bVar : arrayList2) {
            Context context = this.f17534a.getContext();
            SpecialEffectsController.Operation operation6 = bVar.f17417a;
            kotlin.jvm.internal.i.d(context, "context");
            C1348m.a aVarB = bVar.b(context);
            if (aVarB != null) {
                if (aVarB.f17623b == null) {
                    arrayList16.add(bVar);
                } else {
                    Fragment fragment4 = operation6.f17542c;
                    if (operation6.f17549k.isEmpty()) {
                        String str9 = str2;
                        if (operation6.f17540a == SpecialEffectsController.Operation.State.f17556d) {
                            operation6.f17548i = false;
                        }
                        operation6.j.add(new c(bVar));
                        str2 = str9;
                        z13 = z11;
                    } else {
                        str = str2;
                        if (Log.isLoggable(str, 2)) {
                            Objects.toString(fragment4);
                        }
                        str2 = str;
                    }
                }
            }
            str = str2;
            str2 = str;
        }
        String str10 = str2;
        for (b bVar2 : arrayList16) {
            SpecialEffectsController.Operation operation7 = bVar2.f17417a;
            Fragment fragment5 = operation7.f17542c;
            if (zIsEmpty) {
                if (!z13) {
                    operation7.j.add(new a(bVar2));
                } else if (Log.isLoggable(str10, 2)) {
                    Objects.toString(fragment5);
                }
            } else if (Log.isLoggable(str10, 2)) {
                Objects.toString(fragment5);
            }
        }
    }
}
