package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0845b;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: SpecialEffectsController.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f17534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17539f;

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    public static class Operation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public State f17540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LifecycleImpact f17541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Fragment f17542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f17543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f17545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f17546g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f17547h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f17548i;
        public final ArrayList j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ArrayList f17549k;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: SpecialEffectsController.kt */
        public static final class LifecycleImpact {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final LifecycleImpact f17550b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final LifecycleImpact f17551c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final LifecycleImpact f17552d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ LifecycleImpact[] f17553e;

            static {
                LifecycleImpact lifecycleImpact = new LifecycleImpact("NONE", 0);
                f17550b = lifecycleImpact;
                LifecycleImpact lifecycleImpact2 = new LifecycleImpact("ADDING", 1);
                f17551c = lifecycleImpact2;
                LifecycleImpact lifecycleImpact3 = new LifecycleImpact("REMOVING", 2);
                f17552d = lifecycleImpact3;
                f17553e = new LifecycleImpact[]{lifecycleImpact, lifecycleImpact2, lifecycleImpact3};
            }

            public LifecycleImpact() {
                throw null;
            }

            public static LifecycleImpact valueOf(String str) {
                return (LifecycleImpact) Enum.valueOf(LifecycleImpact.class, str);
            }

            public static LifecycleImpact[] values() {
                return (LifecycleImpact[]) f17553e.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: SpecialEffectsController.kt */
        public static final class State {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final State f17554b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final State f17555c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final State f17556d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final State f17557e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ State[] f17558f;

            /* JADX INFO: compiled from: SpecialEffectsController.kt */
            public static final class a {
                public static State a(View view) {
                    kotlin.jvm.internal.i.e(view, "<this>");
                    float alpha = view.getAlpha();
                    State state = State.f17557e;
                    if (alpha == 0.0f && view.getVisibility() == 0) {
                        return state;
                    }
                    int visibility = view.getVisibility();
                    if (visibility == 0) {
                        return State.f17555c;
                    }
                    if (visibility == 4) {
                        return state;
                    }
                    if (visibility == 8) {
                        return State.f17556d;
                    }
                    throw new IllegalArgumentException(J4.i.b(visibility, "Unknown visibility "));
                }
            }

            static {
                State state = new State("REMOVED", 0);
                f17554b = state;
                State state2 = new State("VISIBLE", 1);
                f17555c = state2;
                State state3 = new State("GONE", 2);
                f17556d = state3;
                State state4 = new State("INVISIBLE", 3);
                f17557e = state4;
                f17558f = new State[]{state, state2, state3, state4};
            }

            public State() {
                throw null;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) f17558f.clone();
            }

            public final void a(View view, ViewGroup container) {
                kotlin.jvm.internal.i.e(view, "view");
                kotlin.jvm.internal.i.e(container, "container");
                Log.isLoggable("FragmentManager", 2);
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        view.toString();
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            view.toString();
                            container.toString();
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (iOrdinal == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        view.toString();
                    }
                    view.setVisibility(8);
                } else {
                    if (iOrdinal != 3) {
                        return;
                    }
                    if (Log.isLoggable("FragmentManager", 2)) {
                        view.toString();
                    }
                    view.setVisibility(4);
                }
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment) {
            kotlin.jvm.internal.i.e(fragment, "fragment");
            this.f17540a = state;
            this.f17541b = lifecycleImpact;
            this.f17542c = fragment;
            this.f17543d = new ArrayList();
            this.f17548i = true;
            ArrayList arrayList = new ArrayList();
            this.j = arrayList;
            this.f17549k = arrayList;
        }

        public final void a(ViewGroup container) {
            kotlin.jvm.internal.i.e(container, "container");
            this.f17547h = false;
            if (this.f17544e) {
                return;
            }
            this.f17544e = true;
            if (this.j.isEmpty()) {
                b();
                return;
            }
            for (a aVar : kotlin.collections.q.o0(this.f17549k)) {
                aVar.getClass();
                if (!aVar.f17560b) {
                    aVar.b(container);
                }
                aVar.f17560b = true;
            }
        }

        public void b() {
            this.f17547h = false;
            if (this.f17545f) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.f17545f = true;
            Iterator it = this.f17543d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(a effect) {
            kotlin.jvm.internal.i.e(effect, "effect");
            ArrayList arrayList = this.j;
            if (arrayList.remove(effect) && arrayList.isEmpty()) {
                b();
            }
        }

        public final void d(State state, LifecycleImpact lifecycleImpact) {
            int iOrdinal = lifecycleImpact.ordinal();
            State state2 = State.f17554b;
            Fragment fragment = this.f17542c;
            if (iOrdinal == 0) {
                if (this.f17540a != state2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(fragment);
                        Objects.toString(this.f17540a);
                        state.toString();
                    }
                    this.f17540a = state;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.f17540a == state2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(fragment);
                        Objects.toString(this.f17541b);
                    }
                    this.f17540a = State.f17555c;
                    this.f17541b = LifecycleImpact.f17551c;
                    this.f17548i = true;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(fragment);
                Objects.toString(this.f17540a);
                Objects.toString(this.f17541b);
            }
            this.f17540a = state2;
            this.f17541b = LifecycleImpact.f17552d;
            this.f17548i = true;
        }

        public void e() {
            this.f17547h = true;
        }

        public final String toString() {
            StringBuilder sbA = C7.g.a("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbA.append(this.f17540a);
            sbA.append(" lifecycleImpact = ");
            sbA.append(this.f17541b);
            sbA.append(" fragment = ");
            sbA.append(this.f17542c);
            sbA.append('}');
            return sbA.toString();
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f17560b;

        public boolean a() {
            return this instanceof DefaultSpecialEffectsController.c;
        }

        public void b(ViewGroup container) {
            kotlin.jvm.internal.i.e(container, "container");
        }

        public void c(ViewGroup container) {
            kotlin.jvm.internal.i.e(container, "container");
        }

        public void d(C0845b backEvent, ViewGroup container) {
            kotlin.jvm.internal.i.e(backEvent, "backEvent");
            kotlin.jvm.internal.i.e(container, "container");
        }

        public void e(ViewGroup container) {
            kotlin.jvm.internal.i.e(container, "container");
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    public static final class b extends Operation {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final G f17561l;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(Operation.State state, Operation.LifecycleImpact lifecycleImpact, G fragmentStateManager) {
            kotlin.jvm.internal.i.e(fragmentStateManager, "fragmentStateManager");
            Fragment fragment = fragmentStateManager.f17476c;
            kotlin.jvm.internal.i.d(fragment, "fragmentStateManager.fragment");
            super(state, lifecycleImpact, fragment);
            this.f17561l = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void b() {
            super.b();
            this.f17542c.mTransitioning = false;
            this.f17561l.i();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void e() {
            if (this.f17547h) {
                return;
            }
            this.f17547h = true;
            Operation.LifecycleImpact lifecycleImpact = this.f17541b;
            Operation.LifecycleImpact lifecycleImpact2 = Operation.LifecycleImpact.f17551c;
            G g10 = this.f17561l;
            if (lifecycleImpact != lifecycleImpact2) {
                if (lifecycleImpact == Operation.LifecycleImpact.f17552d) {
                    Fragment fragment = g10.f17476c;
                    kotlin.jvm.internal.i.d(fragment, "fragmentStateManager.fragment");
                    View viewRequireView = fragment.requireView();
                    kotlin.jvm.internal.i.d(viewRequireView, "fragment.requireView()");
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(viewRequireView.findFocus());
                        viewRequireView.toString();
                        fragment.toString();
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = g10.f17476c;
            kotlin.jvm.internal.i.d(fragment2, "fragmentStateManager.fragment");
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (Log.isLoggable("FragmentManager", 2)) {
                    viewFindFocus.toString();
                    fragment2.toString();
                }
            }
            View viewRequireView2 = this.f17542c.requireView();
            kotlin.jvm.internal.i.d(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment2.toString();
                    viewRequireView2.toString();
                }
                g10.a();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    viewRequireView2.toString();
                }
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
            if (Log.isLoggable("FragmentManager", 2)) {
                fragment2.getPostOnViewCreatedAlpha();
            }
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17562a;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f17562a = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        this.f17534a = container;
        this.f17535b = new ArrayList();
        this.f17536c = new ArrayList();
    }

    public static final SpecialEffectsController i(ViewGroup container, y fragmentManager) {
        kotlin.jvm.internal.i.e(container, "container");
        kotlin.jvm.internal.i.e(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.i.d(fragmentManager.K(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        DefaultSpecialEffectsController defaultSpecialEffectsController = new DefaultSpecialEffectsController(container);
        container.setTag(R.id.special_effects_controller_view_tag, defaultSpecialEffectsController);
        return defaultSpecialEffectsController;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z10;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z10 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Operation operation = (Operation) it.next();
                if (!operation.f17549k.isEmpty()) {
                    ArrayList arrayList2 = operation.f17549k;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    Iterator it2 = arrayList2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            break;
                        }
                    } while (((a) it2.next()).a());
                }
                z10 = false;
            }
        }
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                kotlin.collections.p.z(arrayList3, ((Operation) it3.next()).f17549k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(Operation operation) {
        kotlin.jvm.internal.i.e(operation, "operation");
        if (operation.f17548i) {
            Operation.State state = operation.f17540a;
            View viewRequireView = operation.f17542c.requireView();
            kotlin.jvm.internal.i.d(viewRequireView, "operation.fragment.requireView()");
            state.a(viewRequireView, this.f17534a);
            operation.f17548i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c(ArrayList operations) {
        kotlin.jvm.internal.i.e(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            kotlin.collections.p.z(arrayList, ((Operation) it.next()).f17549k);
        }
        List listO0 = kotlin.collections.q.o0(kotlin.collections.q.s0(arrayList));
        int size = listO0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a) listO0.get(i10)).c(this.f17534a);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a((Operation) operations.get(i11));
        }
        List listO1 = kotlin.collections.q.o0(operations);
        int size3 = listO1.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Operation operation = (Operation) listO1.get(i12);
            if (operation.f17549k.isEmpty()) {
                operation.b();
            }
        }
    }

    public final void d(Operation.State state, Operation.LifecycleImpact lifecycleImpact, G g10) {
        synchronized (this.f17535b) {
            try {
                Fragment fragment = g10.f17476c;
                kotlin.jvm.internal.i.d(fragment, "fragmentStateManager.fragment");
                Operation operationF = f(fragment);
                if (operationF == null) {
                    Fragment fragment2 = g10.f17476c;
                    operationF = (fragment2.mTransitioning || fragment2.mRemoving) ? g(fragment2) : null;
                }
                if (operationF != null) {
                    operationF.d(state, lifecycleImpact);
                    return;
                }
                final b bVar = new b(state, lifecycleImpact, g10);
                this.f17535b.add(bVar);
                bVar.f17543d.add(new Runnable() { // from class: androidx.fragment.app.U
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecialEffectsController this$0 = this.f17564b;
                        kotlin.jvm.internal.i.e(this$0, "this$0");
                        SpecialEffectsController.b bVar2 = bVar;
                        if (this$0.f17535b.contains(bVar2)) {
                            SpecialEffectsController.Operation.State state2 = bVar2.f17540a;
                            View view = bVar2.f17542c.mView;
                            kotlin.jvm.internal.i.d(view, "operation.fragment.mView");
                            state2.a(view, this$0.f17534a);
                        }
                    }
                });
                bVar.f17543d.add(new V(this, 0, bVar));
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (this.f17539f) {
            return;
        }
        if (!this.f17534a.isAttachedToWindow()) {
            h();
            this.f17538e = false;
            return;
        }
        synchronized (this.f17535b) {
            try {
                ArrayList<Operation> arrayListP0 = kotlin.collections.q.p0(this.f17536c);
                this.f17536c.clear();
                for (Operation operation : arrayListP0) {
                    operation.f17546g = !this.f17535b.isEmpty() && operation.f17542c.mTransitioning;
                }
                for (Operation operation2 : arrayListP0) {
                    if (this.f17537d) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(operation2);
                        }
                        operation2.b();
                    } else {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(operation2);
                        }
                        operation2.a(this.f17534a);
                    }
                    this.f17537d = false;
                    if (!operation2.f17545f) {
                        this.f17536c.add(operation2);
                    }
                }
                if (!this.f17535b.isEmpty()) {
                    m();
                    ArrayList arrayListP1 = kotlin.collections.q.p0(this.f17535b);
                    if (arrayListP1.isEmpty()) {
                        return;
                    }
                    this.f17535b.clear();
                    this.f17536c.addAll(arrayListP1);
                    Log.isLoggable("FragmentManager", 2);
                    b(arrayListP1, this.f17538e);
                    boolean zJ = j(arrayListP1);
                    Iterator it = arrayListP1.iterator();
                    boolean z10 = true;
                    while (it.hasNext()) {
                        if (!((Operation) it.next()).f17542c.mTransitioning) {
                            z10 = false;
                        }
                    }
                    this.f17537d = z10 && !zJ;
                    Log.isLoggable("FragmentManager", 2);
                    if (!z10) {
                        l(arrayListP1);
                        c(arrayListP1);
                    } else if (zJ) {
                        l(arrayListP1);
                        int size = arrayListP1.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            a((Operation) arrayListP1.get(i10));
                        }
                    }
                    this.f17538e = false;
                    Log.isLoggable("FragmentManager", 2);
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Operation f(Fragment fragment) {
        Object next;
        Iterator it = this.f17535b.iterator();
        while (it.hasNext()) {
            next = it.next();
            Operation operation = (Operation) next;
            if (kotlin.jvm.internal.i.a(operation.f17542c, fragment) && !operation.f17544e) {
                return (Operation) next;
            }
        }
        next = null;
        return (Operation) next;
    }

    public final Operation g(Fragment fragment) {
        Object next;
        Iterator it = this.f17536c.iterator();
        while (it.hasNext()) {
            next = it.next();
            Operation operation = (Operation) next;
            if (kotlin.jvm.internal.i.a(operation.f17542c, fragment) && !operation.f17544e) {
                return (Operation) next;
            }
        }
        next = null;
        return (Operation) next;
    }

    public final void h() {
        Log.isLoggable("FragmentManager", 2);
        boolean zIsAttachedToWindow = this.f17534a.isAttachedToWindow();
        synchronized (this.f17535b) {
            try {
                m();
                l(this.f17535b);
                ArrayList<Operation> arrayListP0 = kotlin.collections.q.p0(this.f17536c);
                Iterator it = arrayListP0.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).f17546g = false;
                }
                for (Operation operation : arrayListP0) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f17534a);
                        }
                        Objects.toString(operation);
                    }
                    operation.a(this.f17534a);
                }
                ArrayList<Operation> arrayListP1 = kotlin.collections.q.p0(this.f17535b);
                Iterator it2 = arrayListP1.iterator();
                while (it2.hasNext()) {
                    ((Operation) it2.next()).f17546g = false;
                }
                for (Operation operation2 : arrayListP1) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f17534a);
                        }
                        Objects.toString(operation2);
                    }
                    operation2.a(this.f17534a);
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        Object objPrevious;
        synchronized (this.f17535b) {
            try {
                m();
                ArrayList arrayList = this.f17535b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    Operation operation = (Operation) objPrevious;
                    View view = operation.f17542c.mView;
                    kotlin.jvm.internal.i.d(view, "operation.fragment.mView");
                    Operation.State stateA = Operation.State.a.a(view);
                    Operation.State state = operation.f17540a;
                    Operation.State state2 = Operation.State.f17555c;
                    if (state == state2 && stateA != state2) {
                        break;
                    }
                }
                Operation operation2 = (Operation) objPrevious;
                Fragment fragment = operation2 != null ? operation2.f17542c : null;
                this.f17539f = fragment != null ? fragment.isPostponed() : false;
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Operation) arrayList.get(i10)).e();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kotlin.collections.p.z(arrayList2, ((Operation) it.next()).f17549k);
        }
        List listO0 = kotlin.collections.q.o0(kotlin.collections.q.s0(arrayList2));
        int size2 = listO0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a aVar = (a) listO0.get(i11);
            aVar.getClass();
            ViewGroup container = this.f17534a;
            kotlin.jvm.internal.i.e(container, "container");
            if (!aVar.f17559a) {
                aVar.e(container);
            }
            aVar.f17559a = true;
        }
    }

    public final void m() {
        Operation.State state;
        for (Operation operation : this.f17535b) {
            if (operation.f17541b == Operation.LifecycleImpact.f17551c) {
                View viewRequireView = operation.f17542c.requireView();
                kotlin.jvm.internal.i.d(viewRequireView, "fragment.requireView()");
                int visibility = viewRequireView.getVisibility();
                if (visibility == 0) {
                    state = Operation.State.f17555c;
                } else if (visibility == 4) {
                    state = Operation.State.f17557e;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(J4.i.b(visibility, "Unknown visibility "));
                    }
                    state = Operation.State.f17556d;
                }
                operation.d(state, Operation.LifecycleImpact.f17550b);
            }
        }
    }
}
