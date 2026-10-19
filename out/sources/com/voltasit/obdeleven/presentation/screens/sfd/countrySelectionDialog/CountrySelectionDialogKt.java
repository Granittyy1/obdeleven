package com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog;

import G8.C0705g;
import Ia.l;
import Ia.p;
import S4.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.N;
import androidx.compose.material.ShapesKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.f;
import androidx.lifecycle.Y;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.presentation.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import me.zhanghai.android.materialprogressbar.R;
import org.koin.compose.KoinApplicationKt;
import p027c1.b;
import p293xa.r;

/* JADX INFO: compiled from: CountrySelectionDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CountrySelectionDialogKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(CountrySelectionViewModel countrySelectionViewModel, final boolean z10, final Ia.a<r> onDismissRequest, final l<? super C0705g, r> onClick, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        CountrySelectionViewModel countrySelectionViewModel2;
        final CountrySelectionViewModel countrySelectionViewModel3;
        i.e(onDismissRequest, "onDismissRequest");
        i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(103676086);
        int i12 = i11 & 1;
        int i13 = i12 != 0 ? i10 | 2 : i10;
        if ((i11 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.c(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i13 |= 384;
        } else if ((i10 & 896) == 0) {
            i13 |= c1086gP.k(onDismissRequest) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i13 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i13 |= c1086gP.k(onClick) ? 2048 : 1024;
        }
        if (i12 == 1 && (i13 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
            countrySelectionViewModel3 = countrySelectionViewModel;
        } else {
            c1086gP.r0();
            if ((i10 & 1) == 0 || c1086gP.a0()) {
                if (i12 != 0) {
                    c1086gP.e(667488325);
                    c0 c0VarA = b.a(c1086gP);
                    if (c0VarA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    p014b1.a aVarA = Fb.a.a(c0VarA, c1086gP);
                    org.koin.core.scope.a aVarA2 = KoinApplicationKt.a(c1086gP);
                    c1086gP.e(-1614864554);
                    Y yA = Gb.a.a(kotlin.jvm.internal.l.a(CountrySelectionViewModel.class), c0VarA.getViewModelStore(), null, aVarA, null, aVarA2, null);
                    c1086gP.T(false);
                    c1086gP.T(false);
                    i13 &= -15;
                    countrySelectionViewModel2 = (CountrySelectionViewModel) yA;
                }
                int i14 = i13;
                c1086gP.U();
                final List list = (List) countrySelectionViewModel2.f33055p.getValue();
                final String str = (String) countrySelectionViewModel2.f33056q.getValue();
                final CountrySelectionViewModel countrySelectionViewModel4 = countrySelectionViewModel2;
                AndroidDialog_androidKt.a(onDismissRequest, new f(3), androidx.compose.runtime.internal.a.b(1820593549, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionDialogKt$CountrySelectionDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            List<C0705g> list2 = list;
                            boolean z11 = z10;
                            l<C0705g, r> lVar = onClick;
                            final CountrySelectionViewModel countrySelectionViewModel5 = countrySelectionViewModel4;
                            CountrySelectionDialogKt.b(list2, z11, lVar, new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionDialogKt$CountrySelectionDialog$1.1
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str2) {
                                    String it = str2;
                                    i.e(it, "it");
                                    CountrySelectionViewModel countrySelectionViewModel6 = countrySelectionViewModel5;
                                    countrySelectionViewModel6.getClass();
                                    countrySelectionViewModel6.f33056q.setValue(it);
                                    List<C0705g> list3 = countrySelectionViewModel6.f33057r;
                                    if (list3 == null) {
                                        i.m("allCountries");
                                        throw null;
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : list3) {
                                        if (n.J(((C0705g) obj).f3495a, it, true)) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    countrySelectionViewModel6.f33055p.setValue(arrayList);
                                    return r.f47939a;
                                }
                            }, str, interfaceC1084f3, 8);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), c1086gP, ((i14 >> 6) & 14) | 432, 0);
                countrySelectionViewModel3 = countrySelectionViewModel2;
            } else {
                c1086gP.w();
                if (i12 != 0) {
                    i13 &= -15;
                }
            }
            countrySelectionViewModel2 = countrySelectionViewModel;
            int i15 = i13;
            c1086gP.U();
            final List<C0705g> list2 = (List) countrySelectionViewModel2.f33055p.getValue();
            final String str2 = (String) countrySelectionViewModel2.f33056q.getValue();
            final CountrySelectionViewModel countrySelectionViewModel5 = countrySelectionViewModel2;
            AndroidDialog_androidKt.a(onDismissRequest, new f(3), androidx.compose.runtime.internal.a.b(1820593549, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionDialogKt$CountrySelectionDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        List<C0705g> list3 = list2;
                        boolean z11 = z10;
                        l<C0705g, r> lVar = onClick;
                        final CountrySelectionViewModel countrySelectionViewModel6 = countrySelectionViewModel5;
                        CountrySelectionDialogKt.b(list3, z11, lVar, new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionDialogKt$CountrySelectionDialog$1.1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str3) {
                                String it = str3;
                                i.e(it, "it");
                                CountrySelectionViewModel countrySelectionViewModel7 = countrySelectionViewModel6;
                                countrySelectionViewModel7.getClass();
                                countrySelectionViewModel7.f33056q.setValue(it);
                                List<C0705g> list4 = countrySelectionViewModel7.f33057r;
                                if (list4 == null) {
                                    i.m("allCountries");
                                    throw null;
                                }
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : list4) {
                                    if (n.J(((C0705g) obj).f3495a, it, true)) {
                                        arrayList.add(obj);
                                    }
                                }
                                countrySelectionViewModel7.f33055p.setValue(arrayList);
                                return r.f47939a;
                            }
                        }, str2, interfaceC1084f3, 8);
                    }
                    return r.f47939a;
                }
            }, c1086gP), c1086gP, ((i15 >> 6) & 14) | 432, 0);
            countrySelectionViewModel3 = countrySelectionViewModel2;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionDialogKt$CountrySelectionDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CountrySelectionDialogKt.a(countrySelectionViewModel3, z10, onDismissRequest, onClick, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    public static final void b(final List<C0705g> countries, final boolean z10, final l<? super C0705g, r> onClick, final l<? super String, r> onSearchChange, final String searchValue, InterfaceC1084f interfaceC1084f, final int i10) {
        i.e(countries, "countries");
        i.e(onClick, "onClick");
        i.e(onSearchChange, "onSearchChange");
        i.e(searchValue, "searchValue");
        C1086g c1086gP = interfaceC1084f.p(-1390102631);
        SurfaceKt.a(PaddingKt.g(16, 24, h.a.f13984b), ((N) c1086gP.x(ShapesKt.f11807a)).f11776b, ((C1034j) c1086gP.x(ColorsKt.f11693a)).c(), 0L, null, 0.0f, androidx.compose.runtime.internal.a.b(441862109, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionDialogKt$DialogContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                    interfaceC1084f3.w();
                } else {
                    h.a aVar = h.a.f13984b;
                    float f10 = 16;
                    h hVarG = PaddingKt.g(f10, 24, aVar);
                    String str = searchValue;
                    l<String, r> lVar = onSearchChange;
                    final boolean z11 = z10;
                    final l<C0705g, r> lVar2 = onClick;
                    final List<C0705g> list = countries;
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, interfaceC1084f3, 0);
                    int iF = interfaceC1084f3.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                    h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f3.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f3.r();
                    if (interfaceC1084f3.m()) {
                        interfaceC1084f3.v(aVar2);
                    } else {
                        interfaceC1084f3.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                    p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                        k.b(iF, interfaceC1084f3, iF, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                    TextKt.b(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.dialog_country_code_selection_title), null, 0L, G0.a.g(20), null, androidx.compose.ui.text.font.l.f15443h, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 199680, 0, 131030);
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11834a;
                    TextFieldKt.a(str, lVar, PaddingKt.j(W.d(aVar, 1.0f), 0.0f, f10, 0.0f, 0.0f, 13), false, false, null, ComposableSingletons$CountrySelectionDialogKt.f33052a, null, null, null, false, null, null, null, true, 0, 0, null, null, TextFieldDefaults.b(0L, 0L, 0L, e.a.f32285h, 0L, e.a.f32281d, 0L, interfaceC1084f3, 2031551), interfaceC1084f3, 1573248, 24576, 507832);
                    AndroidView_androidKt.b(new l<Context, RecyclerView>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionDialogKt$DialogContent$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final RecyclerView invoke(Context context) {
                            Context context2 = context;
                            i.e(context2, "context");
                            RecyclerView recyclerView = new RecyclerView(context2, null);
                            boolean z12 = z11;
                            l<C0705g, r> lVar3 = lVar2;
                            List<C0705g> list2 = list;
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
                            linearLayoutManager.h1(1);
                            recyclerView.setLayoutManager(linearLayoutManager);
                            recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            a aVar3 = new a(lVar3, z12);
                            i.e(list2, "<set-?>");
                            aVar3.f33060c = list2;
                            aVar3.notifyDataSetChanged();
                            recyclerView.setAdapter(aVar3);
                            return recyclerView;
                        }
                    }, null, new l<RecyclerView, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionDialogKt$DialogContent$1$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(RecyclerView recyclerView) {
                            RecyclerView view = recyclerView;
                            i.e(view, "view");
                            RecyclerView.Adapter adapter = view.getAdapter();
                            i.c(adapter, "null cannot be cast to non-null type com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountryAdapter");
                            a aVar3 = (a) adapter;
                            List<C0705g> list2 = list;
                            i.e(list2, "<set-?>");
                            aVar3.f33060c = list2;
                            aVar3.notifyDataSetChanged();
                            return r.f47939a;
                        }
                    }, interfaceC1084f3, 0, 2);
                    interfaceC1084f3.J();
                }
                return r.f47939a;
            }
        }, c1086gP), c1086gP, 1572870, 56);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionDialogKt$DialogContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CountrySelectionDialogKt.b(countries, z10, onClick, onSearchChange, searchValue, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
