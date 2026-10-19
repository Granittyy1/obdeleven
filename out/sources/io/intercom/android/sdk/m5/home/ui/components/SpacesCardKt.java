package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SpaceItem;
import io.intercom.android.sdk.m5.home.data.SpaceItemType;
import io.intercom.android.sdk.m5.home.reducers.HomeItemBadgeReducerKt;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: SpacesCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SpacesCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt$SpacesCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: SpacesCard.kt */
    public static final class AnonymousClass1 implements Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ HomeCards.HomeSpacesData $homeSpacesData;
        final /* synthetic */ Ia.l<SpaceItemType, p293xa.r> $onItemClick;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt$SpacesCard$1$WhenMappings */
        /* JADX INFO: compiled from: SpacesCard.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SpaceItemType.values().length];
                try {
                    iArr[SpaceItemType.MESSAGES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SpaceItemType.HELP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SpaceItemType.TICKETS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HomeCards.HomeSpacesData homeSpacesData, Ia.l<? super SpaceItemType, p293xa.r> lVar) {
            this.$homeSpacesData = homeSpacesData;
            this.$onItemClick = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$4$lambda$3$lambda$2$lambda$1(Ia.l onItemClick, SpaceItem item) {
            kotlin.jvm.internal.i.e(onItemClick, "$onItemClick");
            kotlin.jvm.internal.i.e(item, "$item");
            onItemClick.invoke(item.getType());
            return p293xa.r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0954n, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f, int i10) {
            int i11;
            char c10;
            boolean z10;
            kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            HomeCards.HomeSpacesData homeSpacesData = this.$homeSpacesData;
            final Ia.l<SpaceItemType, p293xa.r> lVar = this.$onItemClick;
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar2);
            } else {
                interfaceC1084f.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            List<SpaceItem> spaceItems = homeSpacesData.getSpaceItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : spaceItems) {
                if (kotlin.collections.k.M(((SpaceItem) obj).getType(), SpaceItemType.values())) {
                    arrayList.add(obj);
                }
            }
            interfaceC1084f.L(-1735936299);
            int i12 = 0;
            for (Object obj2 : arrayList) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    kotlin.collections.l.x();
                    throw null;
                }
                final SpaceItem spaceItem = (SpaceItem) obj2;
                int i14 = WhenMappings.$EnumSwitchMapping$0[spaceItem.getType().ordinal()];
                if (i14 == 1) {
                    i11 = R.drawable.intercom_messages_icon;
                } else if (i14 == 2) {
                    i11 = R.drawable.intercom_help_centre_icon;
                } else {
                    if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i11 = R.drawable.intercom_ticket_detail_icon;
                }
                String label = spaceItem.getLabel();
                HomeItemBadge homeItemBadgeReduceHomeItemBadge = HomeItemBadgeReducerKt.reduceHomeItemBadge(spaceItem.getBadge());
                Integer numValueOf = Integer.valueOf(i11);
                interfaceC1084f.L(-1302667345);
                boolean zK = interfaceC1084f.K(lVar) | interfaceC1084f.K(spaceItem);
                Object objF = interfaceC1084f.f();
                if (zK || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.a() { // from class: io.intercom.android.sdk.m5.home.ui.components.n
                        @Override // Ia.a
                        public final Object invoke() {
                            return SpacesCardKt.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2$lambda$1(lVar, spaceItem);
                        }
                    };
                    interfaceC1084f.E(objF);
                }
                interfaceC1084f.D();
                int i15 = i12;
                ArrayList arrayList2 = arrayList;
                androidx.compose.ui.h.a aVar3 = aVar;
                HomeItemKt.HomeItem(null, numValueOf, null, null, null, label, null, homeItemBadgeReduceHomeItemBadge, (Ia.a) objF, interfaceC1084f, 0, 93);
                interfaceC1084f.L(-1735917837);
                if (i15 != arrayList2.size() - 1) {
                    c10 = 16;
                    z10 = false;
                    IntercomDividerKt.IntercomDivider(PaddingKt.h(W.d(aVar3, 1.0f), 16, 0.0f, 2), interfaceC1084f, 6, 0);
                } else {
                    c10 = 16;
                    z10 = false;
                }
                interfaceC1084f.D();
                aVar = aVar3;
                i12 = i13;
                arrayList = arrayList2;
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
    }

    public static final void SpacesCard(final HomeCards.HomeSpacesData homeSpacesData, final Ia.l<? super SpaceItemType, p293xa.r> onItemClick, InterfaceC1084f interfaceC1084f, final int i10) {
        kotlin.jvm.internal.i.e(homeSpacesData, "homeSpacesData");
        kotlin.jvm.internal.i.e(onItemClick, "onItemClick");
        C1086g c1086gP = interfaceC1084f.p(-261271608);
        IntercomCardKt.IntercomCard(null, null, androidx.compose.runtime.internal.a.b(1212336956, new AnonymousClass1(homeSpacesData, onItemClick), c1086gP), c1086gP, 384, 3);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.home.ui.components.m
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SpacesCardKt.SpacesCard$lambda$0(homeSpacesData, onItemClick, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SpacesCard$lambda$0(HomeCards.HomeSpacesData homeSpacesData, Ia.l onItemClick, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(homeSpacesData, "$homeSpacesData");
        kotlin.jvm.internal.i.e(onItemClick, "$onItemClick");
        SpacesCard(homeSpacesData, onItemClick, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
