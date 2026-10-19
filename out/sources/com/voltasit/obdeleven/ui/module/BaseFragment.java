package com.voltasit.obdeleven.ui.module;

import C4.v;
import J8.p;
import M0.h;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.text.font.s;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.D;
import com.parse.ParseUser;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2177w0;
import com.voltasit.obdeleven.ui.dialogs.J0;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import p220r9.P;
import p255u9.z;
import p293xa.r;

/* JADX INFO: compiled from: BaseFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseFragment<T extends M0.h> extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.voltasit.obdeleven.utils.d f34082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f34083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f34084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2177w0 f34086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f34087g = (p) Cb.a.i(this).a(null, null, kotlin.jvm.internal.l.a(p.class));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f34088h = R.layout.fragment_empty;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34089i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bundle f34090k;

    /* JADX INFO: compiled from: BaseFragment.kt */
    public static final class a implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f34091b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.l lVar) {
            this.f34091b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f34091b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f34091b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f34091b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f34091b.hashCode();
        }
    }

    public static z v() {
        int i10 = z.f47484b;
        return (z) ParseUser.getCurrentUser();
    }

    public boolean A() {
        if (!q().E()) {
            return false;
        }
        if (s() == Positionable$Transition.f31111c) {
            r().j(false);
            return true;
        }
        if (s() != Positionable$Transition.f31112d) {
            return false;
        }
        r().j(true);
        return true;
    }

    public View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        return null;
    }

    public final void E(int i10) {
        if (getActivity() != null) {
            P.b(requireActivity(), i10);
        }
    }

    public final void F(String str) {
        ActivityC1347l activityC1347lRequireActivity = requireActivity();
        kotlin.jvm.internal.i.b(str);
        P.a(activityC1347lRequireActivity, str);
    }

    public final void G(int i10) {
        if (getActivity() != null) {
            P.f(requireActivity(), i10);
        }
    }

    public final void H(int i10) {
        I(getText(i10).toString());
    }

    public final void I(String text) {
        kotlin.jvm.internal.i.e(text, "text");
        if (this.f34086f != null) {
            w();
            p279w9.b bVar = Application.f29634b;
            P8.c.a(5, o(), "Showing preloader without properly closing last one", Arrays.copyOf(new Object[0], 0));
        }
        if (getFragmentManager() == null) {
            return;
        }
        y yVarRequireFragmentManager = requireFragmentManager();
        Bundle bundleD = v.d("key_message", text);
        C2177w0 c2177w0 = new C2177w0();
        c2177w0.setArguments(bundleD);
        c2177w0.f32261r = yVarRequireFragmentManager;
        this.f34086f = c2177w0;
        c2177w0.A();
    }

    public final void J() {
        H(R.string.common_loading);
    }

    public final void K(Ia.l<? super DialogInterface, r> onCancel, Ia.l<? super DialogInterface, r> lVar) {
        kotlin.jvm.internal.i.e(onCancel, "onCancel");
        new F5.b(requireContext(), 0).l(getResources().getString(R.string.common_error)).c(getResources().getString(R.string.common_check_network_connection)).g(getResources().getString(R.string.common_cancel), new com.voltasit.obdeleven.presentation.signIn.k(1, onCancel)).j(getResources().getString(R.string.common_try_again), new J0(1, lVar)).a().show().setCanceledOnTouchOutside(false);
    }

    @p293xa.d
    public final void L(BaseFragment<M0.h> baseFragment, View sharedView, String str) {
        kotlin.jvm.internal.i.e(sharedView, "sharedView");
        sharedView.setTag(str);
        baseFragment.setArguments(baseFragment.getArguments() != null ? baseFragment.getArguments() : new Bundle());
        NavigationManager navigationManager = q().f33533B;
        kotlin.jvm.internal.i.b(navigationManager);
        navigationManager.n(baseFragment, sharedView);
    }

    public final void M() {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(4, "MainActivityFragment", "%s wakeLockHold()", Arrays.copyOf(new Object[]{o()}, 1));
        q().T();
    }

    public final void N() {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(4, "MainActivityFragment", "%s wakeLockRelease()", Arrays.copyOf(new Object[]{o()}, 1));
        q().U();
    }

    public abstract String o();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        this.f34087g.f("MainActivityFragment", s.b(o(), " onCreate()"));
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments() != null ? getArguments() : new Bundle();
        }
        this.f34090k = bundle;
        if (bundle != null && bundle.getBoolean("is_fragment_instance_saved") && (bundle2 = this.f34090k) != null) {
            bundle2.putBoolean("is_fragment_instance_saved", false);
        }
        this.f34085e = true;
        this.f34089i = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.i.e(menu, "menu");
        kotlin.jvm.internal.i.e(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        com.voltasit.obdeleven.utils.d dVar = this.f34082b;
        kotlin.jvm.internal.i.b(dVar);
        BaseFragment baseFragment = dVar.f34392a;
        if (!baseFragment.getClass().isAnnotationPresent(O8.b.class) || TextUtils.isEmpty(((O8.b) baseFragment.getClass().getAnnotation(O8.b.class)).value())) {
            return;
        }
        MenuItem menuItemAdd = menu.add(0, 78, 0, O.a.f(baseFragment.u(), " ", baseFragment.getString(R.string.common_help)));
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(2131231106);
        menuItemAdd.setOnMenuItemClickListener(dVar);
        dVar.f34393b = menuItemAdd;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        p279w9.b bVar = Application.f29634b;
        P8.c.a(4, "MainActivityFragment", "%s onCreateView()", Arrays.copyOf(new Object[]{o()}, 1));
        this.f34085e = true;
        this.f34089i = false;
        this.f34082b = new com.voltasit.obdeleven.utils.d(this);
        View viewB = B(inflater, viewGroup, bundle);
        if (viewB != null) {
            return viewB;
        }
        M0.h hVarA = M0.e.a(inflater, p(), viewGroup, false, null);
        kotlin.jvm.internal.i.c(hVarA, "null cannot be cast to non-null type T of com.voltasit.obdeleven.ui.module.BaseFragment");
        hVarA.q(getViewLifecycleOwner());
        if (bundle != null) {
            O.e.j("MainActivityFragment", "Setting arguments from savedInstanceState");
            setArguments(bundle);
        }
        C(hVarA);
        return hVarA.f4488d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        O.e.s("MainActivityFragment", o() + " onDestroy()");
        if (this.f34086f != null) {
            O.e.D("MainActivityFragment", "Destroying " + o() + " fragment without first closing preloader");
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(4, "MainActivityFragment", "%s onDestroyView()", Arrays.copyOf(new Object[]{o()}, 1));
        this.f34085e = false;
        this.f34089i = true;
        super.onDestroyView();
        com.voltasit.obdeleven.utils.d dVar = this.f34082b;
        kotlin.jvm.internal.i.b(dVar);
        MenuItem menuItem = dVar.f34393b;
        if (menuItem != null) {
            menuItem.setOnMenuItemClickListener(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(4, "MainActivityFragment", "%s onPause()", Arrays.copyOf(new Object[]{o()}, 1));
        super.onPause();
        this.f34084d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        kotlin.jvm.internal.i.e(menu, "menu");
        com.voltasit.obdeleven.utils.d dVar = this.f34082b;
        kotlin.jvm.internal.i.b(dVar);
        ArrayList<MenuItem> arrayList = new ArrayList();
        MenuItem menuItemA = com.voltasit.obdeleven.utils.d.a(menu, arrayList);
        if (menuItemA != null && arrayList.size() <= 1) {
            menu.removeGroup(menuItemA.getItemId());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MenuItem menuItemAdd = menu.add(0, 78, 0, ((MenuItem) it.next()).getTitle());
                menuItemAdd.setIcon(2131231106);
                menuItemAdd.setOnMenuItemClickListener(dVar);
            }
            return;
        }
        if (menuItemA != null || arrayList.size() <= 1) {
            if (menuItemA != null) {
                for (MenuItem menuItem : arrayList) {
                    if (dVar.b().contentEquals(menuItem.getTitle())) {
                        menuItem.setOnMenuItemClickListener(dVar);
                    }
                }
                return;
            }
            return;
        }
        SubMenu subMenuAddSubMenu = menu.addSubMenu(77, 77, 0, dVar.f34392a.getString(R.string.common_help));
        subMenuAddSubMenu.setIcon(2131231106);
        subMenuAddSubMenu.getItem().setShowAsAction(2);
        for (MenuItem menuItem2 : arrayList) {
            menu.removeItem(menuItem2.getItemId());
            MenuItem menuItemAdd2 = subMenuAddSubMenu.add(0, 78, 0, menuItem2.getTitle());
            if (dVar.b().contentEquals(menuItemAdd2.getTitle())) {
                menuItemAdd2.setOnMenuItemClickListener(dVar);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        p100i.a supportActionBar;
        p279w9.b bVar = Application.f29634b;
        P8.c.a(4, "MainActivityFragment", "%s onResume()", Arrays.copyOf(new Object[]{o()}, 1));
        super.onResume();
        this.f34085e = true;
        this.f34089i = false;
        this.j = true;
        this.f34083c = Boolean.valueOf(this.f34083c == null);
        if (u() != null) {
            MainActivity mainActivityQ = q();
            mainActivityQ.f33565u = u();
            if (mainActivityQ.f33534C && (supportActionBar = mainActivityQ.getSupportActionBar()) != null) {
                supportActionBar.o();
                String str = mainActivityQ.f33565u;
                if (str != null) {
                    supportActionBar.s(str);
                }
            }
        }
        Runnable runnable = this.f34084d;
        if (runnable != null) {
            runnable.run();
            this.f34084d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.i.e(bundle, "bundle");
        this.f34087g.f("MainActivityFragment", s.b(o(), " onSaveInstanceState()"));
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_fragment_instance_saved", true);
        this.f34089i = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(4, "MainActivityFragment", "%s onStop()", Arrays.copyOf(new Object[]{o()}, 1));
        super.onStop();
        this.j = false;
        this.f34089i = true;
    }

    public int p() {
        return this.f34088h;
    }

    public final MainActivity q() {
        if (!(getActivity() instanceof MainActivity)) {
            throw new IllegalStateException("Main activity is null or fragment used in wrong activity");
        }
        ActivityC1347l activity = getActivity();
        kotlin.jvm.internal.i.c(activity, "null cannot be cast to non-null type com.voltasit.obdeleven.ui.activity.MainActivity");
        return (MainActivity) activity;
    }

    public final NavigationManager r() {
        NavigationManager navigationManager = q().f33533B;
        kotlin.jvm.internal.i.b(navigationManager);
        return navigationManager;
    }

    public Positionable$Transition s() {
        return Positionable$Transition.f31110b;
    }

    public Positionable$Position t() {
        return Positionable$Position.f31107c;
    }

    public abstract String u();

    public final void w() {
        C2177w0 c2177w0 = this.f34086f;
        if (c2177w0 != null) {
            c2177w0.y();
        }
        this.f34086f = null;
    }

    public final View x(ViewGroup viewGroup, int i10) {
        return LayoutInflater.from(getActivity()).inflate(i10, viewGroup, false);
    }

    public final boolean y() {
        return !this.f34085e || getActivity() == null;
    }

    public final void z(com.voltasit.obdeleven.presentation.d baseViewModel) {
        kotlin.jvm.internal.i.e(baseViewModel, "baseViewModel");
        baseViewModel.f32114c.e(getViewLifecycleOwner(), new a(new Ia.l<PreloaderState, r>(this) { // from class: com.voltasit.obdeleven.ui.module.BaseFragment$observeErrorAndInProgress$1
            final /* synthetic */ BaseFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // Ia.l
            public final r invoke(PreloaderState preloaderState) {
                PreloaderState preloaderState2 = preloaderState;
                O.e.j("MainActivityFragment", "Setting preloader state to " + preloaderState2);
                if (kotlin.jvm.internal.i.a(preloaderState2, PreloaderState.c.f32642a)) {
                    this.this$0.J();
                } else if (kotlin.jvm.internal.i.a(preloaderState2, PreloaderState.d.f32643a)) {
                    this.this$0.w();
                } else {
                    if (!(preloaderState2 instanceof PreloaderState.a)) {
                        if (!(preloaderState2 instanceof PreloaderState.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BaseFragment<T> baseFragment = this.this$0;
                        ((PreloaderState.b) preloaderState2).getClass();
                        baseFragment.I(null);
                        throw null;
                    }
                    this.this$0.H(((PreloaderState.a) preloaderState2).f32641a);
                }
                r rVar = r.f47939a;
                Na.i iVar = E8.a.f3126a;
                return r.f47939a;
            }
        }));
        baseViewModel.f32121k.e(getViewLifecycleOwner(), new a(new Ia.l<String, r>(this) { // from class: com.voltasit.obdeleven.ui.module.BaseFragment$observeErrorAndInProgress$2
            final /* synthetic */ BaseFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final r invoke(String str) {
                P.a(this.this$0.requireActivity(), str);
                return r.f47939a;
            }
        }));
        baseViewModel.f32116e.e(getViewLifecycleOwner(), new a(new Ia.l<Boolean, r>(this) { // from class: com.voltasit.obdeleven.ui.module.BaseFragment$observeErrorAndInProgress$3
            final /* synthetic */ BaseFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                this.this$0.r().h();
                return r.f47939a;
            }
        }));
        baseViewModel.f32123m.e(getViewLifecycleOwner(), new a(new Ia.l<Integer, r>(this) { // from class: com.voltasit.obdeleven.ui.module.BaseFragment$observeErrorAndInProgress$4
            final /* synthetic */ BaseFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                BaseFragment<T> baseFragment = this.this$0;
                kotlin.jvm.internal.i.b(num2);
                baseFragment.G(num2.intValue());
                return r.f47939a;
            }
        }));
        baseViewModel.f32120i.e(getViewLifecycleOwner(), new a(new Ia.l<Integer, r>(this) { // from class: com.voltasit.obdeleven.ui.module.BaseFragment$observeErrorAndInProgress$5
            final /* synthetic */ BaseFragment<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                BaseFragment<T> baseFragment = this.this$0;
                kotlin.jvm.internal.i.b(num2);
                baseFragment.E(num2.intValue());
                return r.f47939a;
            }
        }));
    }

    public void D() {
    }

    public void C(T t8) {
    }
}
