package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.z0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ConversationKebab.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationKebabKt {
    /* JADX WARN: Code duplicated, block: B:100:0x016b A[LOOP:2: B:98:0x0167->B:100:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x017b A[LOOP:3: B:102:0x0177->B:104:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:109:0x019b  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01db  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:124:0x0218  */
    /* JADX WARN: Code duplicated, block: B:126:0x022d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0260  */
    /* JADX WARN: Code duplicated, block: B:130:0x0264  */
    /* JADX WARN: Code duplicated, block: B:133:0x0277  */
    /* JADX WARN: Code duplicated, block: B:135:0x0285  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:139:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:146:0x0319  */
    /* JADX WARN: Code duplicated, block: B:151:0x036e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0183 A[EDGE_INSN: B:156:0x0183->B:105:0x0183 BREAK  A[LOOP:1: B:92:0x0155->B:94:0x0159], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0183 A[EDGE_INSN: B:158:0x0183->B:105:0x0183 BREAK  A[LOOP:3: B:102:0x0177->B:104:0x017b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0117  */
    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Code duplicated, block: B:82:0x012f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x013d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0147  */
    /* JADX WARN: Code duplicated, block: B:91:0x0152  */
    /* JADX WARN: Code duplicated, block: B:94:0x0159 A[LOOP:1: B:92:0x0155->B:94:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0161  */
    /* JADX WARN: Code duplicated, block: B:97:0x0165  */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: ConversationKebab-cf5BqRc, reason: not valid java name */
    public static final void m181ConversationKebabcf5BqRc(List<? extends HeaderMenuItem> list, Ia.l<? super HeaderMenuItem, p293xa.r> lVar, long j, Ia.l<? super MetricData, p293xa.r> lVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        Ia.l<? super HeaderMenuItem, p293xa.r> lVar3;
        int i12;
        long j10;
        int i13;
        int i14;
        Ia.l<? super MetricData, p293xa.r> lVar4;
        int i15;
        List<? extends HeaderMenuItem> list2;
        final Ia.l<? super HeaderMenuItem, p293xa.r> c2358g;
        long j11;
        final Ia.l<? super MetricData, p293xa.r> d10;
        androidx.compose.ui.h.a aVar;
        int i16;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        Iterator<T> it;
        Object next;
        HeaderMenuItem headerMenuItem;
        HeaderMenuItem.TotalCountIndicator totalCountIndicator;
        String unreadMessagesCount;
        boolean z10;
        int size;
        InterfaceC1084f.a.C0153a c0153a;
        final Ia.l<? super MetricData, p293xa.r> lVar5;
        Object objF;
        androidx.compose.runtime.X x10;
        int i17;
        Ia.a<ComposeUiNode> aVar3;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2;
        boolean z11;
        Object objF2;
        boolean z12;
        Object objF3;
        boolean z13;
        final List<? extends HeaderMenuItem> list3;
        final Ia.l<? super HeaderMenuItem, p293xa.r> lVar6;
        final long j12;
        final HeaderMenuItem headerMenuItem2;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objF4;
        z0 z0Var;
        int i18;
        D0 d11;
        C1105p0 c1105p0V;
        int i19;
        D0 d12;
        int i20;
        C1105p0 c1105p0V2;
        C1086g c1086gP = interfaceC1084f.p(1084184456);
        int i21 = c1086gP.f12995O ? -c1086gP.f12988H.f12819v : c1086gP.f12986F.f13267i;
        int i22 = i11 & 1;
        int i23 = i22 != 0 ? i10 | 2 : i10;
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                lVar3 = lVar;
                i23 |= c1086gP.k(lVar3) ? 32 : 16;
            }
            i12 = i11 & 4;
            if (i12 != 0) {
                if ((i10 & 896) == 0) {
                    j10 = j;
                    if (c1086gP.i(j10)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i23 |= i13;
                }
                i14 = i11 & 8;
                if (i14 != 0) {
                    if ((i10 & 7168) == 0) {
                        lVar4 = lVar2;
                        if (c1086gP.k(lVar4)) {
                            i15 = 2048;
                        } else {
                            i15 = 1024;
                        }
                        i23 |= i15;
                    }
                    if (i22 != 1 && (i23 & 5851) == 1170 && c1086gP.s()) {
                        c1086gP.w();
                        list3 = list;
                        lVar6 = lVar3;
                        j12 = j10;
                        lVar5 = lVar4;
                    } else {
                        if (i22 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i24 != 0) {
                            c2358g = new C2358g(0);
                        } else {
                            c2358g = lVar3;
                        }
                        if (i12 != 0) {
                            j11 = androidx.compose.ui.graphics.H.f13495b;
                        } else {
                            j11 = j10;
                        }
                        if (i14 != 0) {
                            d10 = new androidx.navigation.compose.D(2);
                        } else {
                            d10 = lVar4;
                        }
                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                        aVar = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, c1086gP, 48);
                        i16 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                            J4.i.d(i16, c1086gP, i16, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                        c1086gP.L(2047867882);
                        it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                        headerMenuItem = (HeaderMenuItem) next;
                        if (headerMenuItem != null) {
                            totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                        } else {
                            totalCountIndicator = null;
                        }
                        if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                            unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                        } else {
                            unreadMessagesCount = null;
                        }
                        z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                        if (list2.isEmpty()) {
                            c1086gP.L(2048373646);
                            c1086gP.T(false);
                            if (i21 >= 0) {
                                if (c1086gP.f12995O) {
                                    d11 = c1086gP.f12988H;
                                    while (c1086gP.f12995O) {
                                        c1086gP.T(d11.w(d11.f12819v));
                                    }
                                }
                                z0Var = c1086gP.f12986F;
                                while (true) {
                                    i18 = z0Var.f13267i;
                                    if (i18 <= i21) {
                                        break;
                                    } else {
                                        c1086gP.T(z0Var.j(i18));
                                    }
                                }
                            } else {
                                i19 = -i21;
                                d12 = c1086gP.f12988H;
                                while (true) {
                                    i20 = d12.f12819v;
                                    if (i20 <= i19) {
                                        break;
                                    } else {
                                        c1086gP.T(d12.w(i20));
                                    }
                                }
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                final List<? extends HeaderMenuItem> list4 = list2;
                                final Ia.l<? super HeaderMenuItem, p293xa.r> lVar7 = c2358g;
                                final long j13 = j11;
                                final Ia.l<? super MetricData, p293xa.r> lVar8 = d10;
                                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                                    @Override // Ia.p
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        List list5 = list4;
                                        int i25 = i10;
                                        int i26 = i11;
                                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list5, lVar7, j13, lVar8, i25, i26, (InterfaceC1084f) obj, iIntValue);
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        size = list2.size();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (size == 1) {
                            c1086gP.L(2048472753);
                            headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                            String text = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                            int iIcon = icon(headerMenuItem2);
                            boolean enabled = headerMenuItem2.getEnabled();
                            c1086gP.L(-1180838359);
                            if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean zK = z14 | c1086gP.K(headerMenuItem2);
                            if ((i23 & 7168) == 2048) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zK | z15;
                            objF4 = c1086gP.f();
                            if (z16 || objF4 == c0153a) {
                                objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                    }
                                };
                                c1086gP.E(objF4);
                            }
                            c1086gP.T(false);
                            lVar5 = d10;
                            z13 = true;
                            HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text, iIcon, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                            c1086gP.T(false);
                            z12 = false;
                        } else {
                            lVar5 = d10;
                            c1086gP.L(2049182219);
                            c1086gP.L(-1180824432);
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                objF = J0.f(Boolean.FALSE);
                                c1086gP.E(objF);
                            }
                            x10 = (androidx.compose.runtime.X) objF;
                            c1086gP.T(false);
                            androidx.compose.ui.h hVarU = androidx.compose.foundation.layout.W.u(aVar);
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                            i17 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarU);
                            ComposeUiNode.f14331c0.getClass();
                            aVar3 = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                            pVar2 = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i17))) {
                                J4.i.d(i17, c1086gP, i17, pVar2);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                            int i25 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                            boolean z17 = !((Boolean) x10.getValue()).booleanValue();
                            c1086gP.L(-1935443118);
                            if ((i23 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF2 = c1086gP.f();
                            if (z11 || objF2 == c0153a) {
                                objF2 = new C2361j(x10, 0, lVar5);
                                c1086gP.E(objF2);
                            }
                            c1086gP.T(false);
                            z12 = false;
                            HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i25, unreadMessagesCount, z17, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                            androidx.compose.ui.h hVarQ = androidx.compose.foundation.layout.W.q(aVar, 220);
                            boolean zBooleanValue = ((Boolean) x10.getValue()).booleanValue();
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i26 = IntercomTheme.$stable;
                            long jM621getBackground0d7_KjU = intercomTheme.getColors(c1086gP, i26).m621getBackground0d7_KjU();
                            p270w.a aVar4 = intercomTheme.getShapes(c1086gP, i26).f12430b;
                            float f10 = 8;
                            c1086gP.L(-1935428387);
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = new C2362k(x10, 0);
                                c1086gP.E(objF3);
                            }
                            c1086gP.T(false);
                            AndroidMenu_androidKt.a(zBooleanValue, (Ia.a) objF3, hVarQ, 0L, null, null, aVar4, jM621getBackground0d7_KjU, 0.0f, f10, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                            z13 = true;
                            c1086gP.T(true);
                            c1086gP.T(false);
                        }
                        c1086gP.T(z12);
                        c1086gP.T(z13);
                        list3 = list2;
                        lVar6 = c2358g;
                        j12 = j11;
                    }
                    c1105p0V2 = c1086gP.V();
                    if (c1105p0V2 != null) {
                        c1105p0V2.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, lVar6, j12, lVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i23 |= 3072;
                lVar4 = lVar2;
                if (i22 != 1) {
                    if (i22 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i24 != 0) {
                        c2358g = new C2358g(0);
                    } else {
                        c2358g = lVar3;
                    }
                    if (i12 != 0) {
                        j11 = androidx.compose.ui.graphics.H.f13495b;
                    } else {
                        j11 = j10;
                    }
                    if (i14 != 0) {
                        d10 = new androidx.navigation.compose.D(2);
                    } else {
                        d10 = lVar4;
                    }
                    androidx.compose.ui.f.b bVar2 = androidx.compose.ui.d.a.f13344k;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar2, c1086gP, 48);
                    i16 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, aVar);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    } else {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                    c1086gP.L(2047867882);
                    it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list2.isEmpty()) {
                        c1086gP.L(2048373646);
                        c1086gP.T(false);
                        if (i21 >= 0) {
                            if (c1086gP.f12995O) {
                                d11 = c1086gP.f12988H;
                                while (c1086gP.f12995O) {
                                    c1086gP.T(d11.w(d11.f12819v));
                                }
                            }
                            z0Var = c1086gP.f12986F;
                            while (true) {
                                i18 = z0Var.f13267i;
                                if (i18 <= i21) {
                                    break;
                                    break;
                                }
                                c1086gP.T(z0Var.j(i18));
                            }
                        } else {
                            i19 = -i21;
                            d12 = c1086gP.f12988H;
                            while (true) {
                                i20 = d12.f12819v;
                                if (i20 <= i19) {
                                    break;
                                    break;
                                }
                                c1086gP.T(d12.w(i20));
                            }
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final List list5 = list2;
                            final Ia.l lVar9 = c2358g;
                            final long j14 = j11;
                            final Ia.l lVar10 = d10;
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    List list6 = list5;
                                    int i27 = i10;
                                    int i28 = i11;
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list6, lVar9, j14, lVar10, i27, i28, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    size = list2.size();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (size == 1) {
                        c1086gP.L(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                        String text2 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                        int iIcon2 = icon(headerMenuItem2);
                        boolean enabled2 = headerMenuItem2.getEnabled();
                        c1086gP.L(-1180838359);
                        if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zK2 = z14 | c1086gP.K(headerMenuItem2);
                        if ((i23 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zK2 | z15;
                        objF4 = c1086gP.f();
                        if (z16) {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        }
                        c1086gP.T(false);
                        lVar5 = d10;
                        z13 = true;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text2, iIcon2, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled2, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                        c1086gP.T(false);
                        z12 = false;
                    } else {
                        lVar5 = d10;
                        c1086gP.L(2049182219);
                        c1086gP.L(-1180824432);
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            objF = J0.f(Boolean.FALSE);
                            c1086gP.E(objF);
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarU2 = androidx.compose.foundation.layout.W.u(aVar);
                        C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i17 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarU2);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA2);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                        pVar2 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        } else {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                        int i27 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                        boolean z18 = !((Boolean) x10.getValue()).booleanValue();
                        c1086gP.L(-1935443118);
                        if ((i23 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z11) {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        z12 = false;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i27, unreadMessagesCount, z18, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.h hVarQ2 = androidx.compose.foundation.layout.W.q(aVar, 220);
                        boolean zBooleanValue2 = ((Boolean) x10.getValue()).booleanValue();
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i28 = IntercomTheme.$stable;
                        long jM621getBackground0d7_KjU2 = intercomTheme2.getColors(c1086gP, i28).m621getBackground0d7_KjU();
                        p270w.a aVar5 = intercomTheme2.getShapes(c1086gP, i28).f12430b;
                        float f11 = 8;
                        c1086gP.L(-1935428387);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new C2362k(x10, 0);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        AndroidMenu_androidKt.a(zBooleanValue2, (Ia.a) objF3, hVarQ2, 0L, null, null, aVar5, jM621getBackground0d7_KjU2, 0.0f, f11, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                        z13 = true;
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    c1086gP.T(z12);
                    c1086gP.T(z13);
                    list3 = list2;
                    lVar6 = c2358g;
                    j12 = j11;
                } else {
                    if (i22 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i24 != 0) {
                        c2358g = new C2358g(0);
                    } else {
                        c2358g = lVar3;
                    }
                    if (i12 != 0) {
                        j11 = androidx.compose.ui.graphics.H.f13495b;
                    } else {
                        j11 = j10;
                    }
                    if (i14 != 0) {
                        d10 = new androidx.navigation.compose.D(2);
                    } else {
                        d10 = lVar4;
                    }
                    androidx.compose.ui.f.b bVar3 = androidx.compose.ui.d.a.f13344k;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.foundation.layout.T tA3 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar3, c1086gP, 48);
                    i16 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                    androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, aVar);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    } else {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                    c1086gP.L(2047867882);
                    it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list2.isEmpty()) {
                        c1086gP.L(2048373646);
                        c1086gP.T(false);
                        if (i21 >= 0) {
                            if (c1086gP.f12995O) {
                                d11 = c1086gP.f12988H;
                                while (c1086gP.f12995O) {
                                    c1086gP.T(d11.w(d11.f12819v));
                                }
                            }
                            z0Var = c1086gP.f12986F;
                            while (true) {
                                i18 = z0Var.f13267i;
                                if (i18 <= i21) {
                                    break;
                                    break;
                                }
                                c1086gP.T(z0Var.j(i18));
                            }
                        } else {
                            i19 = -i21;
                            d12 = c1086gP.f12988H;
                            while (true) {
                                i20 = d12.f12819v;
                                if (i20 <= i19) {
                                    break;
                                    break;
                                }
                                c1086gP.T(d12.w(i20));
                            }
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final List list6 = list2;
                            final Ia.l lVar11 = c2358g;
                            final long j15 = j11;
                            final Ia.l lVar12 = d10;
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    List list7 = list6;
                                    int i29 = i10;
                                    int i210 = i11;
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list7, lVar11, j15, lVar12, i29, i210, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    size = list2.size();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (size == 1) {
                        c1086gP.L(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                        String text3 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                        int iIcon3 = icon(headerMenuItem2);
                        boolean enabled3 = headerMenuItem2.getEnabled();
                        c1086gP.L(-1180838359);
                        if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zK3 = z14 | c1086gP.K(headerMenuItem2);
                        if ((i23 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zK3 | z15;
                        objF4 = c1086gP.f();
                        if (z16) {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        }
                        c1086gP.T(false);
                        lVar5 = d10;
                        z13 = true;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text3, iIcon3, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled3, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                        c1086gP.T(false);
                        z12 = false;
                    } else {
                        lVar5 = d10;
                        c1086gP.L(2049182219);
                        c1086gP.L(-1180824432);
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            objF = J0.f(Boolean.FALSE);
                            c1086gP.E(objF);
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarU3 = androidx.compose.foundation.layout.W.u(aVar);
                        C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i17 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                        androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarU3);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA3);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                        pVar2 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        } else {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                        int i29 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                        boolean z19 = !((Boolean) x10.getValue()).booleanValue();
                        c1086gP.L(-1935443118);
                        if ((i23 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z11) {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        z12 = false;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i29, unreadMessagesCount, z19, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.h hVarQ3 = androidx.compose.foundation.layout.W.q(aVar, 220);
                        boolean zBooleanValue3 = ((Boolean) x10.getValue()).booleanValue();
                        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                        int i210 = IntercomTheme.$stable;
                        long jM621getBackground0d7_KjU3 = intercomTheme3.getColors(c1086gP, i210).m621getBackground0d7_KjU();
                        p270w.a aVar6 = intercomTheme3.getShapes(c1086gP, i210).f12430b;
                        float f12 = 8;
                        c1086gP.L(-1935428387);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new C2362k(x10, 0);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        AndroidMenu_androidKt.a(zBooleanValue3, (Ia.a) objF3, hVarQ3, 0L, null, null, aVar6, jM621getBackground0d7_KjU3, 0.0f, f12, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                        z13 = true;
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    c1086gP.T(z12);
                    c1086gP.T(z13);
                    list3 = list2;
                    lVar6 = c2358g;
                    j12 = j11;
                }
                c1105p0V2 = c1086gP.V();
                if (c1105p0V2 != null) {
                    c1105p0V2.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, lVar6, j12, lVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i23 |= 384;
            j10 = j;
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    lVar4 = lVar2;
                    if (c1086gP.k(lVar4)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i23 |= i15;
                }
                if (i22 != 1) {
                    if (i22 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i24 != 0) {
                        c2358g = new C2358g(0);
                    } else {
                        c2358g = lVar3;
                    }
                    if (i12 != 0) {
                        j11 = androidx.compose.ui.graphics.H.f13495b;
                    } else {
                        j11 = j10;
                    }
                    if (i14 != 0) {
                        d10 = new androidx.navigation.compose.D(2);
                    } else {
                        d10 = lVar4;
                    }
                    androidx.compose.ui.f.b bVar4 = androidx.compose.ui.d.a.f13344k;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.foundation.layout.T tA4 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar4, c1086gP, 48);
                    i16 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                    androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, aVar);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA4);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    } else {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
                    c1086gP.L(2047867882);
                    it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list2.isEmpty()) {
                        c1086gP.L(2048373646);
                        c1086gP.T(false);
                        if (i21 >= 0) {
                            if (c1086gP.f12995O) {
                                d11 = c1086gP.f12988H;
                                while (c1086gP.f12995O) {
                                    c1086gP.T(d11.w(d11.f12819v));
                                }
                            }
                            z0Var = c1086gP.f12986F;
                            while (true) {
                                i18 = z0Var.f13267i;
                                if (i18 <= i21) {
                                    break;
                                    break;
                                }
                                c1086gP.T(z0Var.j(i18));
                            }
                        } else {
                            i19 = -i21;
                            d12 = c1086gP.f12988H;
                            while (true) {
                                i20 = d12.f12819v;
                                if (i20 <= i19) {
                                    break;
                                    break;
                                }
                                c1086gP.T(d12.w(i20));
                            }
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final List list7 = list2;
                            final Ia.l lVar13 = c2358g;
                            final long j16 = j11;
                            final Ia.l lVar14 = d10;
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    List list8 = list7;
                                    int i211 = i10;
                                    int i212 = i11;
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list8, lVar13, j16, lVar14, i211, i212, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    size = list2.size();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (size == 1) {
                        c1086gP.L(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                        String text4 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                        int iIcon4 = icon(headerMenuItem2);
                        boolean enabled4 = headerMenuItem2.getEnabled();
                        c1086gP.L(-1180838359);
                        if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zK4 = z14 | c1086gP.K(headerMenuItem2);
                        if ((i23 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zK4 | z15;
                        objF4 = c1086gP.f();
                        if (z16) {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        }
                        c1086gP.T(false);
                        lVar5 = d10;
                        z13 = true;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text4, iIcon4, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled4, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                        c1086gP.T(false);
                        z12 = false;
                    } else {
                        lVar5 = d10;
                        c1086gP.L(2049182219);
                        c1086gP.L(-1180824432);
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            objF = J0.f(Boolean.FALSE);
                            c1086gP.E(objF);
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarU4 = androidx.compose.foundation.layout.W.u(aVar);
                        C0953m c0953mA4 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i17 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                        androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarU4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA4);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
                        pVar2 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        } else {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
                        int i211 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                        boolean z110 = !((Boolean) x10.getValue()).booleanValue();
                        c1086gP.L(-1935443118);
                        if ((i23 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z11) {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        z12 = false;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i211, unreadMessagesCount, z110, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.h hVarQ4 = androidx.compose.foundation.layout.W.q(aVar, 220);
                        boolean zBooleanValue4 = ((Boolean) x10.getValue()).booleanValue();
                        IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                        int i212 = IntercomTheme.$stable;
                        long jM621getBackground0d7_KjU4 = intercomTheme4.getColors(c1086gP, i212).m621getBackground0d7_KjU();
                        p270w.a aVar7 = intercomTheme4.getShapes(c1086gP, i212).f12430b;
                        float f13 = 8;
                        c1086gP.L(-1935428387);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new C2362k(x10, 0);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        AndroidMenu_androidKt.a(zBooleanValue4, (Ia.a) objF3, hVarQ4, 0L, null, null, aVar7, jM621getBackground0d7_KjU4, 0.0f, f13, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                        z13 = true;
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    c1086gP.T(z12);
                    c1086gP.T(z13);
                    list3 = list2;
                    lVar6 = c2358g;
                    j12 = j11;
                } else {
                    if (i22 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i24 != 0) {
                        c2358g = new C2358g(0);
                    } else {
                        c2358g = lVar3;
                    }
                    if (i12 != 0) {
                        j11 = androidx.compose.ui.graphics.H.f13495b;
                    } else {
                        j11 = j10;
                    }
                    if (i14 != 0) {
                        d10 = new androidx.navigation.compose.D(2);
                    } else {
                        d10 = lVar4;
                    }
                    androidx.compose.ui.f.b bVar5 = androidx.compose.ui.d.a.f13344k;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.foundation.layout.T tA5 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar5, c1086gP, 48);
                    i16 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                    androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, aVar);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA5);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P9);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    } else {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC9);
                    c1086gP.L(2047867882);
                    it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list2.isEmpty()) {
                        c1086gP.L(2048373646);
                        c1086gP.T(false);
                        if (i21 >= 0) {
                            if (c1086gP.f12995O) {
                                d11 = c1086gP.f12988H;
                                while (c1086gP.f12995O) {
                                    c1086gP.T(d11.w(d11.f12819v));
                                }
                            }
                            z0Var = c1086gP.f12986F;
                            while (true) {
                                i18 = z0Var.f13267i;
                                if (i18 <= i21) {
                                    break;
                                    break;
                                }
                                c1086gP.T(z0Var.j(i18));
                            }
                        } else {
                            i19 = -i21;
                            d12 = c1086gP.f12988H;
                            while (true) {
                                i20 = d12.f12819v;
                                if (i20 <= i19) {
                                    break;
                                    break;
                                }
                                c1086gP.T(d12.w(i20));
                            }
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final List list8 = list2;
                            final Ia.l lVar15 = c2358g;
                            final long j17 = j11;
                            final Ia.l lVar16 = d10;
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    List list9 = list8;
                                    int i213 = i10;
                                    int i214 = i11;
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list9, lVar15, j17, lVar16, i213, i214, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    size = list2.size();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (size == 1) {
                        c1086gP.L(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                        String text5 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                        int iIcon5 = icon(headerMenuItem2);
                        boolean enabled5 = headerMenuItem2.getEnabled();
                        c1086gP.L(-1180838359);
                        if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zK5 = z14 | c1086gP.K(headerMenuItem2);
                        if ((i23 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zK5 | z15;
                        objF4 = c1086gP.f();
                        if (z16) {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        }
                        c1086gP.T(false);
                        lVar5 = d10;
                        z13 = true;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text5, iIcon5, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled5, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                        c1086gP.T(false);
                        z12 = false;
                    } else {
                        lVar5 = d10;
                        c1086gP.L(2049182219);
                        c1086gP.L(-1180824432);
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            objF = J0.f(Boolean.FALSE);
                            c1086gP.E(objF);
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarU5 = androidx.compose.foundation.layout.W.u(aVar);
                        C0953m c0953mA5 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i17 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                        androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVarU5);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA5);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P10);
                        pVar2 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        } else {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC10);
                        int i213 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                        boolean z111 = !((Boolean) x10.getValue()).booleanValue();
                        c1086gP.L(-1935443118);
                        if ((i23 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z11) {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        z12 = false;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i213, unreadMessagesCount, z111, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.h hVarQ5 = androidx.compose.foundation.layout.W.q(aVar, 220);
                        boolean zBooleanValue5 = ((Boolean) x10.getValue()).booleanValue();
                        IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                        int i214 = IntercomTheme.$stable;
                        long jM621getBackground0d7_KjU5 = intercomTheme5.getColors(c1086gP, i214).m621getBackground0d7_KjU();
                        p270w.a aVar8 = intercomTheme5.getShapes(c1086gP, i214).f12430b;
                        float f14 = 8;
                        c1086gP.L(-1935428387);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new C2362k(x10, 0);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        AndroidMenu_androidKt.a(zBooleanValue5, (Ia.a) objF3, hVarQ5, 0L, null, null, aVar8, jM621getBackground0d7_KjU5, 0.0f, f14, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                        z13 = true;
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    c1086gP.T(z12);
                    c1086gP.T(z13);
                    list3 = list2;
                    lVar6 = c2358g;
                    j12 = j11;
                }
                c1105p0V2 = c1086gP.V();
                if (c1105p0V2 != null) {
                    c1105p0V2.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, lVar6, j12, lVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i23 |= 3072;
            lVar4 = lVar2;
            if (i22 != 1) {
                if (i22 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i24 != 0) {
                    c2358g = new C2358g(0);
                } else {
                    c2358g = lVar3;
                }
                if (i12 != 0) {
                    j11 = androidx.compose.ui.graphics.H.f13495b;
                } else {
                    j11 = j10;
                }
                if (i14 != 0) {
                    d10 = new androidx.navigation.compose.D(2);
                } else {
                    d10 = lVar4;
                }
                androidx.compose.ui.f.b bVar6 = androidx.compose.ui.d.a.f13344k;
                aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.foundation.layout.T tA6 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar6, c1086gP, 48);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, aVar);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA6);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P11);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11);
                c1086gP.L(2047867882);
                it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list2.isEmpty()) {
                    c1086gP.L(2048373646);
                    c1086gP.T(false);
                    if (i21 >= 0) {
                        if (c1086gP.f12995O) {
                            d11 = c1086gP.f12988H;
                            while (c1086gP.f12995O) {
                                c1086gP.T(d11.w(d11.f12819v));
                            }
                        }
                        z0Var = c1086gP.f12986F;
                        while (true) {
                            i18 = z0Var.f13267i;
                            if (i18 <= i21) {
                                break;
                                break;
                            }
                            c1086gP.T(z0Var.j(i18));
                        }
                    } else {
                        i19 = -i21;
                        d12 = c1086gP.f12988H;
                        while (true) {
                            i20 = d12.f12819v;
                            if (i20 <= i19) {
                                break;
                                break;
                            }
                            c1086gP.T(d12.w(i20));
                        }
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final List list9 = list2;
                        final Ia.l lVar17 = c2358g;
                        final long j18 = j11;
                        final Ia.l lVar18 = d10;
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                List list10 = list9;
                                int i215 = i10;
                                int i216 = i11;
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list10, lVar17, j18, lVar18, i215, i216, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                size = list2.size();
                c0153a = InterfaceC1084f.a.f12980a;
                if (size == 1) {
                    c1086gP.L(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                    String text6 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                    int iIcon6 = icon(headerMenuItem2);
                    boolean enabled6 = headerMenuItem2.getEnabled();
                    c1086gP.L(-1180838359);
                    if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zK6 = z14 | c1086gP.K(headerMenuItem2);
                    if ((i23 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK6 | z15;
                    objF4 = c1086gP.f();
                    if (z16) {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    c1086gP.T(false);
                    lVar5 = d10;
                    z13 = true;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text6, iIcon6, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled6, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                    c1086gP.T(false);
                    z12 = false;
                } else {
                    lVar5 = d10;
                    c1086gP.L(2049182219);
                    c1086gP.L(-1180824432);
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        objF = J0.f(Boolean.FALSE);
                        c1086gP.E(objF);
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarU6 = androidx.compose.foundation.layout.W.u(aVar);
                    C0953m c0953mA6 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                    androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarU6);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA6);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P12);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    } else {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC12);
                    int i215 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                    boolean z112 = !((Boolean) x10.getValue()).booleanValue();
                    c1086gP.L(-1935443118);
                    if ((i23 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z11) {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    z12 = false;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i215, unreadMessagesCount, z112, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.h hVarQ6 = androidx.compose.foundation.layout.W.q(aVar, 220);
                    boolean zBooleanValue6 = ((Boolean) x10.getValue()).booleanValue();
                    IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                    int i216 = IntercomTheme.$stable;
                    long jM621getBackground0d7_KjU6 = intercomTheme6.getColors(c1086gP, i216).m621getBackground0d7_KjU();
                    p270w.a aVar9 = intercomTheme6.getShapes(c1086gP, i216).f12430b;
                    float f15 = 8;
                    c1086gP.L(-1935428387);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new C2362k(x10, 0);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    AndroidMenu_androidKt.a(zBooleanValue6, (Ia.a) objF3, hVarQ6, 0L, null, null, aVar9, jM621getBackground0d7_KjU6, 0.0f, f15, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                    z13 = true;
                    c1086gP.T(true);
                    c1086gP.T(false);
                }
                c1086gP.T(z12);
                c1086gP.T(z13);
                list3 = list2;
                lVar6 = c2358g;
                j12 = j11;
            } else {
                if (i22 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i24 != 0) {
                    c2358g = new C2358g(0);
                } else {
                    c2358g = lVar3;
                }
                if (i12 != 0) {
                    j11 = androidx.compose.ui.graphics.H.f13495b;
                } else {
                    j11 = j10;
                }
                if (i14 != 0) {
                    d10 = new androidx.navigation.compose.D(2);
                } else {
                    d10 = lVar4;
                }
                androidx.compose.ui.f.b bVar7 = androidx.compose.ui.d.a.f13344k;
                aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.foundation.layout.T tA7 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar7, c1086gP, 48);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, aVar);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA7);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P13);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC13);
                c1086gP.L(2047867882);
                it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list2.isEmpty()) {
                    c1086gP.L(2048373646);
                    c1086gP.T(false);
                    if (i21 >= 0) {
                        if (c1086gP.f12995O) {
                            d11 = c1086gP.f12988H;
                            while (c1086gP.f12995O) {
                                c1086gP.T(d11.w(d11.f12819v));
                            }
                        }
                        z0Var = c1086gP.f12986F;
                        while (true) {
                            i18 = z0Var.f13267i;
                            if (i18 <= i21) {
                                break;
                                break;
                            }
                            c1086gP.T(z0Var.j(i18));
                        }
                    } else {
                        i19 = -i21;
                        d12 = c1086gP.f12988H;
                        while (true) {
                            i20 = d12.f12819v;
                            if (i20 <= i19) {
                                break;
                                break;
                            }
                            c1086gP.T(d12.w(i20));
                        }
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final List list10 = list2;
                        final Ia.l lVar19 = c2358g;
                        final long j19 = j11;
                        final Ia.l lVar110 = d10;
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                List list11 = list10;
                                int i217 = i10;
                                int i218 = i11;
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list11, lVar19, j19, lVar110, i217, i218, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                size = list2.size();
                c0153a = InterfaceC1084f.a.f12980a;
                if (size == 1) {
                    c1086gP.L(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                    String text7 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                    int iIcon7 = icon(headerMenuItem2);
                    boolean enabled7 = headerMenuItem2.getEnabled();
                    c1086gP.L(-1180838359);
                    if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zK7 = z14 | c1086gP.K(headerMenuItem2);
                    if ((i23 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK7 | z15;
                    objF4 = c1086gP.f();
                    if (z16) {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    c1086gP.T(false);
                    lVar5 = d10;
                    z13 = true;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text7, iIcon7, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled7, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                    c1086gP.T(false);
                    z12 = false;
                } else {
                    lVar5 = d10;
                    c1086gP.L(2049182219);
                    c1086gP.L(-1180824432);
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        objF = J0.f(Boolean.FALSE);
                        c1086gP.E(objF);
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarU7 = androidx.compose.foundation.layout.W.u(aVar);
                    C0953m c0953mA7 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                    androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, hVarU7);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA7);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P14);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    } else {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC14);
                    int i217 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                    boolean z113 = !((Boolean) x10.getValue()).booleanValue();
                    c1086gP.L(-1935443118);
                    if ((i23 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z11) {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    z12 = false;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i217, unreadMessagesCount, z113, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.h hVarQ7 = androidx.compose.foundation.layout.W.q(aVar, 220);
                    boolean zBooleanValue7 = ((Boolean) x10.getValue()).booleanValue();
                    IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                    int i218 = IntercomTheme.$stable;
                    long jM621getBackground0d7_KjU7 = intercomTheme7.getColors(c1086gP, i218).m621getBackground0d7_KjU();
                    p270w.a aVar10 = intercomTheme7.getShapes(c1086gP, i218).f12430b;
                    float f16 = 8;
                    c1086gP.L(-1935428387);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new C2362k(x10, 0);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    AndroidMenu_androidKt.a(zBooleanValue7, (Ia.a) objF3, hVarQ7, 0L, null, null, aVar10, jM621getBackground0d7_KjU7, 0.0f, f16, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                    z13 = true;
                    c1086gP.T(true);
                    c1086gP.T(false);
                }
                c1086gP.T(z12);
                c1086gP.T(z13);
                list3 = list2;
                lVar6 = c2358g;
                j12 = j11;
            }
            c1105p0V2 = c1086gP.V();
            if (c1105p0V2 != null) {
                c1105p0V2.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, lVar6, j12, lVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i23 |= 48;
        lVar3 = lVar;
        i12 = i11 & 4;
        if (i12 != 0) {
            if ((i10 & 896) == 0) {
                j10 = j;
                if (c1086gP.i(j10)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i23 |= i13;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    lVar4 = lVar2;
                    if (c1086gP.k(lVar4)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i23 |= i15;
                }
                if (i22 != 1) {
                    if (i22 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i24 != 0) {
                        c2358g = new C2358g(0);
                    } else {
                        c2358g = lVar3;
                    }
                    if (i12 != 0) {
                        j11 = androidx.compose.ui.graphics.H.f13495b;
                    } else {
                        j11 = j10;
                    }
                    if (i14 != 0) {
                        d10 = new androidx.navigation.compose.D(2);
                    } else {
                        d10 = lVar4;
                    }
                    androidx.compose.ui.f.b bVar8 = androidx.compose.ui.d.a.f13344k;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.foundation.layout.T tA8 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar8, c1086gP, 48);
                    i16 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                    androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086gP, aVar);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA8);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P15);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    } else {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC15);
                    c1086gP.L(2047867882);
                    it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list2.isEmpty()) {
                        c1086gP.L(2048373646);
                        c1086gP.T(false);
                        if (i21 >= 0) {
                            if (c1086gP.f12995O) {
                                d11 = c1086gP.f12988H;
                                while (c1086gP.f12995O) {
                                    c1086gP.T(d11.w(d11.f12819v));
                                }
                            }
                            z0Var = c1086gP.f12986F;
                            while (true) {
                                i18 = z0Var.f13267i;
                                if (i18 <= i21) {
                                    break;
                                    break;
                                }
                                c1086gP.T(z0Var.j(i18));
                            }
                        } else {
                            i19 = -i21;
                            d12 = c1086gP.f12988H;
                            while (true) {
                                i20 = d12.f12819v;
                                if (i20 <= i19) {
                                    break;
                                    break;
                                }
                                c1086gP.T(d12.w(i20));
                            }
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final List list11 = list2;
                            final Ia.l lVar111 = c2358g;
                            final long j110 = j11;
                            final Ia.l lVar112 = d10;
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    List list12 = list11;
                                    int i219 = i10;
                                    int i2110 = i11;
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list12, lVar111, j110, lVar112, i219, i2110, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    size = list2.size();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (size == 1) {
                        c1086gP.L(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                        String text8 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                        int iIcon8 = icon(headerMenuItem2);
                        boolean enabled8 = headerMenuItem2.getEnabled();
                        c1086gP.L(-1180838359);
                        if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zK8 = z14 | c1086gP.K(headerMenuItem2);
                        if ((i23 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zK8 | z15;
                        objF4 = c1086gP.f();
                        if (z16) {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        }
                        c1086gP.T(false);
                        lVar5 = d10;
                        z13 = true;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text8, iIcon8, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled8, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                        c1086gP.T(false);
                        z12 = false;
                    } else {
                        lVar5 = d10;
                        c1086gP.L(2049182219);
                        c1086gP.L(-1180824432);
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            objF = J0.f(Boolean.FALSE);
                            c1086gP.E(objF);
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarU8 = androidx.compose.foundation.layout.W.u(aVar);
                        C0953m c0953mA8 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i17 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
                        androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, hVarU8);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA8);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P16);
                        pVar2 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        } else {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC16);
                        int i219 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                        boolean z114 = !((Boolean) x10.getValue()).booleanValue();
                        c1086gP.L(-1935443118);
                        if ((i23 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z11) {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        z12 = false;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i219, unreadMessagesCount, z114, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.h hVarQ8 = androidx.compose.foundation.layout.W.q(aVar, 220);
                        boolean zBooleanValue8 = ((Boolean) x10.getValue()).booleanValue();
                        IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                        int i2110 = IntercomTheme.$stable;
                        long jM621getBackground0d7_KjU8 = intercomTheme8.getColors(c1086gP, i2110).m621getBackground0d7_KjU();
                        p270w.a aVar11 = intercomTheme8.getShapes(c1086gP, i2110).f12430b;
                        float f17 = 8;
                        c1086gP.L(-1935428387);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new C2362k(x10, 0);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        AndroidMenu_androidKt.a(zBooleanValue8, (Ia.a) objF3, hVarQ8, 0L, null, null, aVar11, jM621getBackground0d7_KjU8, 0.0f, f17, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                        z13 = true;
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    c1086gP.T(z12);
                    c1086gP.T(z13);
                    list3 = list2;
                    lVar6 = c2358g;
                    j12 = j11;
                } else {
                    if (i22 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i24 != 0) {
                        c2358g = new C2358g(0);
                    } else {
                        c2358g = lVar3;
                    }
                    if (i12 != 0) {
                        j11 = androidx.compose.ui.graphics.H.f13495b;
                    } else {
                        j11 = j10;
                    }
                    if (i14 != 0) {
                        d10 = new androidx.navigation.compose.D(2);
                    } else {
                        d10 = lVar4;
                    }
                    androidx.compose.ui.f.b bVar9 = androidx.compose.ui.d.a.f13344k;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.foundation.layout.T tA9 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar9, c1086gP, 48);
                    i16 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P17 = c1086gP.P();
                    androidx.compose.ui.h hVarC17 = ComposedModifierKt.c(c1086gP, aVar);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA9);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P17);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    } else {
                        J4.i.d(i16, c1086gP, i16, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC17);
                    c1086gP.L(2047867882);
                    it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                    headerMenuItem = (HeaderMenuItem) next;
                    if (headerMenuItem != null) {
                        totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                    } else {
                        totalCountIndicator = null;
                    }
                    if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                        unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                    } else {
                        unreadMessagesCount = null;
                    }
                    z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                    if (list2.isEmpty()) {
                        c1086gP.L(2048373646);
                        c1086gP.T(false);
                        if (i21 >= 0) {
                            if (c1086gP.f12995O) {
                                d11 = c1086gP.f12988H;
                                while (c1086gP.f12995O) {
                                    c1086gP.T(d11.w(d11.f12819v));
                                }
                            }
                            z0Var = c1086gP.f12986F;
                            while (true) {
                                i18 = z0Var.f13267i;
                                if (i18 <= i21) {
                                    break;
                                    break;
                                }
                                c1086gP.T(z0Var.j(i18));
                            }
                        } else {
                            i19 = -i21;
                            d12 = c1086gP.f12988H;
                            while (true) {
                                i20 = d12.f12819v;
                                if (i20 <= i19) {
                                    break;
                                    break;
                                }
                                c1086gP.T(d12.w(i20));
                            }
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final List list12 = list2;
                            final Ia.l lVar113 = c2358g;
                            final long j111 = j11;
                            final Ia.l lVar114 = d10;
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    List list13 = list12;
                                    int i2111 = i10;
                                    int i2112 = i11;
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list13, lVar113, j111, lVar114, i2111, i2112, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    size = list2.size();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (size == 1) {
                        c1086gP.L(2048472753);
                        headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                        String text9 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                        int iIcon9 = icon(headerMenuItem2);
                        boolean enabled9 = headerMenuItem2.getEnabled();
                        c1086gP.L(-1180838359);
                        if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zK9 = z14 | c1086gP.K(headerMenuItem2);
                        if ((i23 & 7168) == 2048) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zK9 | z15;
                        objF4 = c1086gP.f();
                        if (z16) {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                                @Override // Ia.a
                                public final Object invoke() {
                                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                                }
                            };
                            c1086gP.E(objF4);
                        }
                        c1086gP.T(false);
                        lVar5 = d10;
                        z13 = true;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text9, iIcon9, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled9, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                        c1086gP.T(false);
                        z12 = false;
                    } else {
                        lVar5 = d10;
                        c1086gP.L(2049182219);
                        c1086gP.L(-1180824432);
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            objF = J0.f(Boolean.FALSE);
                            c1086gP.E(objF);
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarU9 = androidx.compose.foundation.layout.W.u(aVar);
                        C0953m c0953mA9 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i17 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P18 = c1086gP.P();
                        androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086gP, hVarU9);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA9);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P18);
                        pVar2 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        } else {
                            J4.i.d(i17, c1086gP, i17, pVar2);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC18);
                        int i2111 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                        boolean z115 = !((Boolean) x10.getValue()).booleanValue();
                        c1086gP.L(-1935443118);
                        if ((i23 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z11) {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2361j(x10, 0, lVar5);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        z12 = false;
                        HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i2111, unreadMessagesCount, z115, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                        androidx.compose.ui.h hVarQ9 = androidx.compose.foundation.layout.W.q(aVar, 220);
                        boolean zBooleanValue9 = ((Boolean) x10.getValue()).booleanValue();
                        IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                        int i2112 = IntercomTheme.$stable;
                        long jM621getBackground0d7_KjU9 = intercomTheme9.getColors(c1086gP, i2112).m621getBackground0d7_KjU();
                        p270w.a aVar12 = intercomTheme9.getShapes(c1086gP, i2112).f12430b;
                        float f18 = 8;
                        c1086gP.L(-1935428387);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new C2362k(x10, 0);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        AndroidMenu_androidKt.a(zBooleanValue9, (Ia.a) objF3, hVarQ9, 0L, null, null, aVar12, jM621getBackground0d7_KjU9, 0.0f, f18, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                        z13 = true;
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    c1086gP.T(z12);
                    c1086gP.T(z13);
                    list3 = list2;
                    lVar6 = c2358g;
                    j12 = j11;
                }
                c1105p0V2 = c1086gP.V();
                if (c1105p0V2 != null) {
                    c1105p0V2.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, lVar6, j12, lVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i23 |= 3072;
            lVar4 = lVar2;
            if (i22 != 1) {
                if (i22 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i24 != 0) {
                    c2358g = new C2358g(0);
                } else {
                    c2358g = lVar3;
                }
                if (i12 != 0) {
                    j11 = androidx.compose.ui.graphics.H.f13495b;
                } else {
                    j11 = j10;
                }
                if (i14 != 0) {
                    d10 = new androidx.navigation.compose.D(2);
                } else {
                    d10 = lVar4;
                }
                androidx.compose.ui.f.b bVar10 = androidx.compose.ui.d.a.f13344k;
                aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.foundation.layout.T tA10 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar10, c1086gP, 48);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P19 = c1086gP.P();
                androidx.compose.ui.h hVarC19 = ComposedModifierKt.c(c1086gP, aVar);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA10);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P19);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC19);
                c1086gP.L(2047867882);
                it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list2.isEmpty()) {
                    c1086gP.L(2048373646);
                    c1086gP.T(false);
                    if (i21 >= 0) {
                        if (c1086gP.f12995O) {
                            d11 = c1086gP.f12988H;
                            while (c1086gP.f12995O) {
                                c1086gP.T(d11.w(d11.f12819v));
                            }
                        }
                        z0Var = c1086gP.f12986F;
                        while (true) {
                            i18 = z0Var.f13267i;
                            if (i18 <= i21) {
                                break;
                                break;
                            }
                            c1086gP.T(z0Var.j(i18));
                        }
                    } else {
                        i19 = -i21;
                        d12 = c1086gP.f12988H;
                        while (true) {
                            i20 = d12.f12819v;
                            if (i20 <= i19) {
                                break;
                                break;
                            }
                            c1086gP.T(d12.w(i20));
                        }
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final List list13 = list2;
                        final Ia.l lVar115 = c2358g;
                        final long j112 = j11;
                        final Ia.l lVar116 = d10;
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                List list14 = list13;
                                int i2113 = i10;
                                int i2114 = i11;
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list14, lVar115, j112, lVar116, i2113, i2114, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                size = list2.size();
                c0153a = InterfaceC1084f.a.f12980a;
                if (size == 1) {
                    c1086gP.L(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                    String text10 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                    int iIcon10 = icon(headerMenuItem2);
                    boolean enabled10 = headerMenuItem2.getEnabled();
                    c1086gP.L(-1180838359);
                    if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zK10 = z14 | c1086gP.K(headerMenuItem2);
                    if ((i23 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK10 | z15;
                    objF4 = c1086gP.f();
                    if (z16) {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    c1086gP.T(false);
                    lVar5 = d10;
                    z13 = true;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text10, iIcon10, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled10, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                    c1086gP.T(false);
                    z12 = false;
                } else {
                    lVar5 = d10;
                    c1086gP.L(2049182219);
                    c1086gP.L(-1180824432);
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        objF = J0.f(Boolean.FALSE);
                        c1086gP.E(objF);
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarU10 = androidx.compose.foundation.layout.W.u(aVar);
                    C0953m c0953mA10 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P110 = c1086gP.P();
                    androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086gP, hVarU10);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA10);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P110);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    } else {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC110);
                    int i2113 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                    boolean z116 = !((Boolean) x10.getValue()).booleanValue();
                    c1086gP.L(-1935443118);
                    if ((i23 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z11) {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    z12 = false;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i2113, unreadMessagesCount, z116, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.h hVarQ10 = androidx.compose.foundation.layout.W.q(aVar, 220);
                    boolean zBooleanValue10 = ((Boolean) x10.getValue()).booleanValue();
                    IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                    int i2114 = IntercomTheme.$stable;
                    long jM621getBackground0d7_KjU10 = intercomTheme10.getColors(c1086gP, i2114).m621getBackground0d7_KjU();
                    p270w.a aVar13 = intercomTheme10.getShapes(c1086gP, i2114).f12430b;
                    float f19 = 8;
                    c1086gP.L(-1935428387);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new C2362k(x10, 0);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    AndroidMenu_androidKt.a(zBooleanValue10, (Ia.a) objF3, hVarQ10, 0L, null, null, aVar13, jM621getBackground0d7_KjU10, 0.0f, f19, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                    z13 = true;
                    c1086gP.T(true);
                    c1086gP.T(false);
                }
                c1086gP.T(z12);
                c1086gP.T(z13);
                list3 = list2;
                lVar6 = c2358g;
                j12 = j11;
            } else {
                if (i22 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i24 != 0) {
                    c2358g = new C2358g(0);
                } else {
                    c2358g = lVar3;
                }
                if (i12 != 0) {
                    j11 = androidx.compose.ui.graphics.H.f13495b;
                } else {
                    j11 = j10;
                }
                if (i14 != 0) {
                    d10 = new androidx.navigation.compose.D(2);
                } else {
                    d10 = lVar4;
                }
                androidx.compose.ui.f.b bVar11 = androidx.compose.ui.d.a.f13344k;
                aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.foundation.layout.T tA11 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar11, c1086gP, 48);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111 = c1086gP.P();
                androidx.compose.ui.h hVarC111 = ComposedModifierKt.c(c1086gP, aVar);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA11);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P111);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC111);
                c1086gP.L(2047867882);
                it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list2.isEmpty()) {
                    c1086gP.L(2048373646);
                    c1086gP.T(false);
                    if (i21 >= 0) {
                        if (c1086gP.f12995O) {
                            d11 = c1086gP.f12988H;
                            while (c1086gP.f12995O) {
                                c1086gP.T(d11.w(d11.f12819v));
                            }
                        }
                        z0Var = c1086gP.f12986F;
                        while (true) {
                            i18 = z0Var.f13267i;
                            if (i18 <= i21) {
                                break;
                                break;
                            }
                            c1086gP.T(z0Var.j(i18));
                        }
                    } else {
                        i19 = -i21;
                        d12 = c1086gP.f12988H;
                        while (true) {
                            i20 = d12.f12819v;
                            if (i20 <= i19) {
                                break;
                                break;
                            }
                            c1086gP.T(d12.w(i20));
                        }
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final List list14 = list2;
                        final Ia.l lVar117 = c2358g;
                        final long j113 = j11;
                        final Ia.l lVar118 = d10;
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                List list15 = list14;
                                int i2115 = i10;
                                int i2116 = i11;
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list15, lVar117, j113, lVar118, i2115, i2116, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                size = list2.size();
                c0153a = InterfaceC1084f.a.f12980a;
                if (size == 1) {
                    c1086gP.L(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                    String text11 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                    int iIcon11 = icon(headerMenuItem2);
                    boolean enabled11 = headerMenuItem2.getEnabled();
                    c1086gP.L(-1180838359);
                    if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zK11 = z14 | c1086gP.K(headerMenuItem2);
                    if ((i23 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK11 | z15;
                    objF4 = c1086gP.f();
                    if (z16) {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    c1086gP.T(false);
                    lVar5 = d10;
                    z13 = true;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text11, iIcon11, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled11, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                    c1086gP.T(false);
                    z12 = false;
                } else {
                    lVar5 = d10;
                    c1086gP.L(2049182219);
                    c1086gP.L(-1180824432);
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        objF = J0.f(Boolean.FALSE);
                        c1086gP.E(objF);
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarU11 = androidx.compose.foundation.layout.W.u(aVar);
                    C0953m c0953mA11 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P112 = c1086gP.P();
                    androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086gP, hVarU11);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA11);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P112);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    } else {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC112);
                    int i2115 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                    boolean z117 = !((Boolean) x10.getValue()).booleanValue();
                    c1086gP.L(-1935443118);
                    if ((i23 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z11) {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    z12 = false;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i2115, unreadMessagesCount, z117, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.h hVarQ11 = androidx.compose.foundation.layout.W.q(aVar, 220);
                    boolean zBooleanValue11 = ((Boolean) x10.getValue()).booleanValue();
                    IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                    int i2116 = IntercomTheme.$stable;
                    long jM621getBackground0d7_KjU11 = intercomTheme11.getColors(c1086gP, i2116).m621getBackground0d7_KjU();
                    p270w.a aVar14 = intercomTheme11.getShapes(c1086gP, i2116).f12430b;
                    float f110 = 8;
                    c1086gP.L(-1935428387);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new C2362k(x10, 0);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    AndroidMenu_androidKt.a(zBooleanValue11, (Ia.a) objF3, hVarQ11, 0L, null, null, aVar14, jM621getBackground0d7_KjU11, 0.0f, f110, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                    z13 = true;
                    c1086gP.T(true);
                    c1086gP.T(false);
                }
                c1086gP.T(z12);
                c1086gP.T(z13);
                list3 = list2;
                lVar6 = c2358g;
                j12 = j11;
            }
            c1105p0V2 = c1086gP.V();
            if (c1105p0V2 != null) {
                c1105p0V2.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, lVar6, j12, lVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i23 |= 384;
        j10 = j;
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                lVar4 = lVar2;
                if (c1086gP.k(lVar4)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i23 |= i15;
            }
            if (i22 != 1) {
                if (i22 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i24 != 0) {
                    c2358g = new C2358g(0);
                } else {
                    c2358g = lVar3;
                }
                if (i12 != 0) {
                    j11 = androidx.compose.ui.graphics.H.f13495b;
                } else {
                    j11 = j10;
                }
                if (i14 != 0) {
                    d10 = new androidx.navigation.compose.D(2);
                } else {
                    d10 = lVar4;
                }
                androidx.compose.ui.f.b bVar12 = androidx.compose.ui.d.a.f13344k;
                aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.foundation.layout.T tA12 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar12, c1086gP, 48);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P113 = c1086gP.P();
                androidx.compose.ui.h hVarC113 = ComposedModifierKt.c(c1086gP, aVar);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA12);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P113);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC113);
                c1086gP.L(2047867882);
                it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list2.isEmpty()) {
                    c1086gP.L(2048373646);
                    c1086gP.T(false);
                    if (i21 >= 0) {
                        if (c1086gP.f12995O) {
                            d11 = c1086gP.f12988H;
                            while (c1086gP.f12995O) {
                                c1086gP.T(d11.w(d11.f12819v));
                            }
                        }
                        z0Var = c1086gP.f12986F;
                        while (true) {
                            i18 = z0Var.f13267i;
                            if (i18 <= i21) {
                                break;
                                break;
                            }
                            c1086gP.T(z0Var.j(i18));
                        }
                    } else {
                        i19 = -i21;
                        d12 = c1086gP.f12988H;
                        while (true) {
                            i20 = d12.f12819v;
                            if (i20 <= i19) {
                                break;
                                break;
                            }
                            c1086gP.T(d12.w(i20));
                        }
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final List list15 = list2;
                        final Ia.l lVar119 = c2358g;
                        final long j114 = j11;
                        final Ia.l lVar1110 = d10;
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                List list16 = list15;
                                int i2117 = i10;
                                int i2118 = i11;
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list16, lVar119, j114, lVar1110, i2117, i2118, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                size = list2.size();
                c0153a = InterfaceC1084f.a.f12980a;
                if (size == 1) {
                    c1086gP.L(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                    String text12 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                    int iIcon12 = icon(headerMenuItem2);
                    boolean enabled12 = headerMenuItem2.getEnabled();
                    c1086gP.L(-1180838359);
                    if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zK12 = z14 | c1086gP.K(headerMenuItem2);
                    if ((i23 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK12 | z15;
                    objF4 = c1086gP.f();
                    if (z16) {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    c1086gP.T(false);
                    lVar5 = d10;
                    z13 = true;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text12, iIcon12, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled12, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                    c1086gP.T(false);
                    z12 = false;
                } else {
                    lVar5 = d10;
                    c1086gP.L(2049182219);
                    c1086gP.L(-1180824432);
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        objF = J0.f(Boolean.FALSE);
                        c1086gP.E(objF);
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarU12 = androidx.compose.foundation.layout.W.u(aVar);
                    C0953m c0953mA12 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P114 = c1086gP.P();
                    androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086gP, hVarU12);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA12);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P114);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    } else {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC114);
                    int i2117 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                    boolean z118 = !((Boolean) x10.getValue()).booleanValue();
                    c1086gP.L(-1935443118);
                    if ((i23 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z11) {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    z12 = false;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i2117, unreadMessagesCount, z118, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.h hVarQ12 = androidx.compose.foundation.layout.W.q(aVar, 220);
                    boolean zBooleanValue12 = ((Boolean) x10.getValue()).booleanValue();
                    IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                    int i2118 = IntercomTheme.$stable;
                    long jM621getBackground0d7_KjU12 = intercomTheme12.getColors(c1086gP, i2118).m621getBackground0d7_KjU();
                    p270w.a aVar15 = intercomTheme12.getShapes(c1086gP, i2118).f12430b;
                    float f111 = 8;
                    c1086gP.L(-1935428387);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new C2362k(x10, 0);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    AndroidMenu_androidKt.a(zBooleanValue12, (Ia.a) objF3, hVarQ12, 0L, null, null, aVar15, jM621getBackground0d7_KjU12, 0.0f, f111, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                    z13 = true;
                    c1086gP.T(true);
                    c1086gP.T(false);
                }
                c1086gP.T(z12);
                c1086gP.T(z13);
                list3 = list2;
                lVar6 = c2358g;
                j12 = j11;
            } else {
                if (i22 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i24 != 0) {
                    c2358g = new C2358g(0);
                } else {
                    c2358g = lVar3;
                }
                if (i12 != 0) {
                    j11 = androidx.compose.ui.graphics.H.f13495b;
                } else {
                    j11 = j10;
                }
                if (i14 != 0) {
                    d10 = new androidx.navigation.compose.D(2);
                } else {
                    d10 = lVar4;
                }
                androidx.compose.ui.f.b bVar13 = androidx.compose.ui.d.a.f13344k;
                aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.foundation.layout.T tA13 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar13, c1086gP, 48);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P115 = c1086gP.P();
                androidx.compose.ui.h hVarC115 = ComposedModifierKt.c(c1086gP, aVar);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA13);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P115);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC115);
                c1086gP.L(2047867882);
                it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
                headerMenuItem = (HeaderMenuItem) next;
                if (headerMenuItem != null) {
                    totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
                } else {
                    totalCountIndicator = null;
                }
                if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                    unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
                } else {
                    unreadMessagesCount = null;
                }
                z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
                if (list2.isEmpty()) {
                    c1086gP.L(2048373646);
                    c1086gP.T(false);
                    if (i21 >= 0) {
                        if (c1086gP.f12995O) {
                            d11 = c1086gP.f12988H;
                            while (c1086gP.f12995O) {
                                c1086gP.T(d11.w(d11.f12819v));
                            }
                        }
                        z0Var = c1086gP.f12986F;
                        while (true) {
                            i18 = z0Var.f13267i;
                            if (i18 <= i21) {
                                break;
                                break;
                            }
                            c1086gP.T(z0Var.j(i18));
                        }
                    } else {
                        i19 = -i21;
                        d12 = c1086gP.f12988H;
                        while (true) {
                            i20 = d12.f12819v;
                            if (i20 <= i19) {
                                break;
                                break;
                            }
                            c1086gP.T(d12.w(i20));
                        }
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final List list16 = list2;
                        final Ia.l lVar1111 = c2358g;
                        final long j115 = j11;
                        final Ia.l lVar1112 = d10;
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                List list17 = list16;
                                int i2119 = i10;
                                int i21110 = i11;
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list17, lVar1111, j115, lVar1112, i2119, i21110, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                        return;
                    }
                    return;
                }
                size = list2.size();
                c0153a = InterfaceC1084f.a.f12980a;
                if (size == 1) {
                    c1086gP.L(2048472753);
                    headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                    String text13 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                    int iIcon13 = icon(headerMenuItem2);
                    boolean enabled13 = headerMenuItem2.getEnabled();
                    c1086gP.L(-1180838359);
                    if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zK13 = z14 | c1086gP.K(headerMenuItem2);
                    if ((i23 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK13 | z15;
                    objF4 = c1086gP.f();
                    if (z16) {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                            @Override // Ia.a
                            public final Object invoke() {
                                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    c1086gP.T(false);
                    lVar5 = d10;
                    z13 = true;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text13, iIcon13, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled13, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                    c1086gP.T(false);
                    z12 = false;
                } else {
                    lVar5 = d10;
                    c1086gP.L(2049182219);
                    c1086gP.L(-1180824432);
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        objF = J0.f(Boolean.FALSE);
                        c1086gP.E(objF);
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarU13 = androidx.compose.foundation.layout.W.u(aVar);
                    C0953m c0953mA13 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P116 = c1086gP.P();
                    androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086gP, hVarU13);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA13);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P116);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    } else {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC116);
                    int i2119 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                    boolean z119 = !((Boolean) x10.getValue()).booleanValue();
                    c1086gP.L(-1935443118);
                    if ((i23 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z11) {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2361j(x10, 0, lVar5);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    z12 = false;
                    HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i2119, unreadMessagesCount, z119, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                    androidx.compose.ui.h hVarQ13 = androidx.compose.foundation.layout.W.q(aVar, 220);
                    boolean zBooleanValue13 = ((Boolean) x10.getValue()).booleanValue();
                    IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                    int i21110 = IntercomTheme.$stable;
                    long jM621getBackground0d7_KjU13 = intercomTheme13.getColors(c1086gP, i21110).m621getBackground0d7_KjU();
                    p270w.a aVar16 = intercomTheme13.getShapes(c1086gP, i21110).f12430b;
                    float f112 = 8;
                    c1086gP.L(-1935428387);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new C2362k(x10, 0);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    AndroidMenu_androidKt.a(zBooleanValue13, (Ia.a) objF3, hVarQ13, 0L, null, null, aVar16, jM621getBackground0d7_KjU13, 0.0f, f112, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                    z13 = true;
                    c1086gP.T(true);
                    c1086gP.T(false);
                }
                c1086gP.T(z12);
                c1086gP.T(z13);
                list3 = list2;
                lVar6 = c2358g;
                j12 = j11;
            }
            c1105p0V2 = c1086gP.V();
            if (c1105p0V2 != null) {
                c1105p0V2.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, lVar6, j12, lVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i23 |= 3072;
        lVar4 = lVar2;
        if (i22 != 1) {
            if (i22 != 0) {
                list2 = EmptyList.f42983b;
            } else {
                list2 = list;
            }
            if (i24 != 0) {
                c2358g = new C2358g(0);
            } else {
                c2358g = lVar3;
            }
            if (i12 != 0) {
                j11 = androidx.compose.ui.graphics.H.f13495b;
            } else {
                j11 = j10;
            }
            if (i14 != 0) {
                d10 = new androidx.navigation.compose.D(2);
            } else {
                d10 = lVar4;
            }
            androidx.compose.ui.f.b bVar14 = androidx.compose.ui.d.a.f13344k;
            aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.foundation.layout.T tA14 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar14, c1086gP, 48);
            i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P117 = c1086gP.P();
            androidx.compose.ui.h hVarC117 = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA14);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P117);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i16, c1086gP, i16, pVar);
            } else {
                J4.i.d(i16, c1086gP, i16, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC117);
            c1086gP.L(2047867882);
            it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
            headerMenuItem = (HeaderMenuItem) next;
            if (headerMenuItem != null) {
                totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
            } else {
                totalCountIndicator = null;
            }
            if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
            } else {
                unreadMessagesCount = null;
            }
            z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
            if (list2.isEmpty()) {
                c1086gP.L(2048373646);
                c1086gP.T(false);
                if (i21 >= 0) {
                    if (c1086gP.f12995O) {
                        d11 = c1086gP.f12988H;
                        while (c1086gP.f12995O) {
                            c1086gP.T(d11.w(d11.f12819v));
                        }
                    }
                    z0Var = c1086gP.f12986F;
                    while (true) {
                        i18 = z0Var.f13267i;
                        if (i18 <= i21) {
                            break;
                            break;
                        }
                        c1086gP.T(z0Var.j(i18));
                    }
                } else {
                    i19 = -i21;
                    d12 = c1086gP.f12988H;
                    while (true) {
                        i20 = d12.f12819v;
                        if (i20 <= i19) {
                            break;
                            break;
                        }
                        c1086gP.T(d12.w(i20));
                    }
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final List list17 = list2;
                    final Ia.l lVar1113 = c2358g;
                    final long j116 = j11;
                    final Ia.l lVar1114 = d10;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            List list18 = list17;
                            int i21111 = i10;
                            int i21112 = i11;
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list18, lVar1113, j116, lVar1114, i21111, i21112, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                    return;
                }
                return;
            }
            size = list2.size();
            c0153a = InterfaceC1084f.a.f12980a;
            if (size == 1) {
                c1086gP.L(2048472753);
                headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                String text14 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                int iIcon14 = icon(headerMenuItem2);
                boolean enabled14 = headerMenuItem2.getEnabled();
                c1086gP.L(-1180838359);
                if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zK14 = z14 | c1086gP.K(headerMenuItem2);
                if ((i23 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zK14 | z15;
                objF4 = c1086gP.f();
                if (z16) {
                    objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                        @Override // Ia.a
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                        @Override // Ia.a
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                        }
                    };
                    c1086gP.E(objF4);
                }
                c1086gP.T(false);
                lVar5 = d10;
                z13 = true;
                HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text14, iIcon14, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled14, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                c1086gP.T(false);
                z12 = false;
            } else {
                lVar5 = d10;
                c1086gP.L(2049182219);
                c1086gP.L(-1180824432);
                objF = c1086gP.f();
                if (objF == c0153a) {
                    objF = J0.f(Boolean.FALSE);
                    c1086gP.E(objF);
                }
                x10 = (androidx.compose.runtime.X) objF;
                c1086gP.T(false);
                androidx.compose.ui.h hVarU14 = androidx.compose.foundation.layout.W.u(aVar);
                C0953m c0953mA14 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P118 = c1086gP.P();
                androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086gP, hVarU14);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA14);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P118);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC118);
                int i21111 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                boolean z1110 = !((Boolean) x10.getValue()).booleanValue();
                c1086gP.L(-1935443118);
                if ((i23 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF2 = c1086gP.f();
                if (z11) {
                    objF2 = new C2361j(x10, 0, lVar5);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new C2361j(x10, 0, lVar5);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                z12 = false;
                HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i21111, unreadMessagesCount, z1110, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                androidx.compose.ui.h hVarQ14 = androidx.compose.foundation.layout.W.q(aVar, 220);
                boolean zBooleanValue14 = ((Boolean) x10.getValue()).booleanValue();
                IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                int i21112 = IntercomTheme.$stable;
                long jM621getBackground0d7_KjU14 = intercomTheme14.getColors(c1086gP, i21112).m621getBackground0d7_KjU();
                p270w.a aVar17 = intercomTheme14.getShapes(c1086gP, i21112).f12430b;
                float f113 = 8;
                c1086gP.L(-1935428387);
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new C2362k(x10, 0);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                AndroidMenu_androidKt.a(zBooleanValue14, (Ia.a) objF3, hVarQ14, 0L, null, null, aVar17, jM621getBackground0d7_KjU14, 0.0f, f113, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                z13 = true;
                c1086gP.T(true);
                c1086gP.T(false);
            }
            c1086gP.T(z12);
            c1086gP.T(z13);
            list3 = list2;
            lVar6 = c2358g;
            j12 = j11;
        } else {
            if (i22 != 0) {
                list2 = EmptyList.f42983b;
            } else {
                list2 = list;
            }
            if (i24 != 0) {
                c2358g = new C2358g(0);
            } else {
                c2358g = lVar3;
            }
            if (i12 != 0) {
                j11 = androidx.compose.ui.graphics.H.f13495b;
            } else {
                j11 = j10;
            }
            if (i14 != 0) {
                d10 = new androidx.navigation.compose.D(2);
            } else {
                d10 = lVar4;
            }
            androidx.compose.ui.f.b bVar15 = androidx.compose.ui.d.a.f13344k;
            aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.foundation.layout.T tA15 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar15, c1086gP, 48);
            i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P119 = c1086gP.P();
            androidx.compose.ui.h hVarC119 = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA15);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P119);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i16, c1086gP, i16, pVar);
            } else {
                J4.i.d(i16, c1086gP, i16, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC119);
            c1086gP.L(2047867882);
            it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((HeaderMenuItem) next) instanceof HeaderMenuItem.Messages));
            headerMenuItem = (HeaderMenuItem) next;
            if (headerMenuItem != null) {
                totalCountIndicator = ((HeaderMenuItem.Messages) headerMenuItem).getTotalCountIndicator();
            } else {
                totalCountIndicator = null;
            }
            if (totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) {
                unreadMessagesCount = ((HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) totalCountIndicator).getUnreadMessagesCount();
            } else {
                unreadMessagesCount = null;
            }
            z10 = totalCountIndicator instanceof HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator;
            if (list2.isEmpty()) {
                c1086gP.L(2048373646);
                c1086gP.T(false);
                if (i21 >= 0) {
                    if (c1086gP.f12995O) {
                        d11 = c1086gP.f12988H;
                        while (c1086gP.f12995O) {
                            c1086gP.T(d11.w(d11.f12819v));
                        }
                    }
                    z0Var = c1086gP.f12986F;
                    while (true) {
                        i18 = z0Var.f13267i;
                        if (i18 <= i21) {
                            break;
                            break;
                        }
                        c1086gP.T(z0Var.j(i18));
                    }
                } else {
                    i19 = -i21;
                    d12 = c1086gP.f12988H;
                    while (true) {
                        i20 = d12.f12819v;
                        if (i20 <= i19) {
                            break;
                            break;
                        }
                        c1086gP.T(d12.w(i20));
                    }
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final List list18 = list2;
                    final Ia.l lVar1115 = c2358g;
                    final long j117 = j11;
                    final Ia.l lVar1116 = d10;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.h
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            List list19 = list18;
                            int i21113 = i10;
                            int i21114 = i11;
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$4(list19, lVar1115, j117, lVar1116, i21113, i21114, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                    return;
                }
                return;
            }
            size = list2.size();
            c0153a = InterfaceC1084f.a.f12980a;
            if (size == 1) {
                c1086gP.L(2048472753);
                headerMenuItem2 = (HeaderMenuItem) kotlin.collections.q.O(list2);
                String text15 = headerMenuItem2.getLabel().getText(c1086gP, StringProvider.$stable);
                int iIcon15 = icon(headerMenuItem2);
                boolean enabled15 = headerMenuItem2.getEnabled();
                c1086gP.L(-1180838359);
                if ((i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zK15 = z14 | c1086gP.K(headerMenuItem2);
                if ((i23 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zK15 | z15;
                objF4 = c1086gP.f();
                if (z16) {
                    objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                        @Override // Ia.a
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    objF4 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i
                        @Override // Ia.a
                        public final Object invoke() {
                            return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(c2358g, headerMenuItem2, d10);
                        }
                    };
                    c1086gP.E(objF4);
                }
                c1086gP.T(false);
                lVar5 = d10;
                z13 = true;
                HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, text15, iIcon15, unreadMessagesCount, false, z10, false, (Ia.a) objF4, enabled15, j11, c1086gP, ((i23 << 21) & 1879048192) | 1572864, 17);
                c1086gP.T(false);
                z12 = false;
            } else {
                lVar5 = d10;
                c1086gP.L(2049182219);
                c1086gP.L(-1180824432);
                objF = c1086gP.f();
                if (objF == c0153a) {
                    objF = J0.f(Boolean.FALSE);
                    c1086gP.E(objF);
                }
                x10 = (androidx.compose.runtime.X) objF;
                c1086gP.T(false);
                androidx.compose.ui.h hVarU15 = androidx.compose.foundation.layout.W.u(aVar);
                C0953m c0953mA15 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1110 = c1086gP.P();
                androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086gP, hVarU15);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA15);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1110);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1110);
                int i21113 = io.intercom.android.sdk.R.drawable.intercom_kebab;
                boolean z1111 = !((Boolean) x10.getValue()).booleanValue();
                c1086gP.L(-1935443118);
                if ((i23 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF2 = c1086gP.f();
                if (z11) {
                    objF2 = new C2361j(x10, 0, lVar5);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new C2361j(x10, 0, lVar5);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                z12 = false;
                HeaderMenuItemRowKt.m183HeaderMenuItemRow6RhP_wg(null, "More Menu", i21113, unreadMessagesCount, z1111, z10, false, (Ia.a) objF2, true, j11, c1086gP, ((i23 << 21) & 1879048192) | 102236208, 1);
                androidx.compose.ui.h hVarQ15 = androidx.compose.foundation.layout.W.q(aVar, 220);
                boolean zBooleanValue15 = ((Boolean) x10.getValue()).booleanValue();
                IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                int i21114 = IntercomTheme.$stable;
                long jM621getBackground0d7_KjU15 = intercomTheme15.getColors(c1086gP, i21114).m621getBackground0d7_KjU();
                p270w.a aVar18 = intercomTheme15.getShapes(c1086gP, i21114).f12430b;
                float f114 = 8;
                c1086gP.L(-1935428387);
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new C2362k(x10, 0);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                AndroidMenu_androidKt.a(zBooleanValue15, (Ia.a) objF3, hVarQ15, 0L, null, null, aVar18, jM621getBackground0d7_KjU15, 0.0f, f114, null, androidx.compose.runtime.internal.a.b(1309645384, new ConversationKebabKt$ConversationKebab$3$3$3(list2, c2358g, lVar5, j11, x10), c1086gP), c1086gP, 805306800, 48, 1336);
                z13 = true;
                c1086gP.T(true);
                c1086gP.T(false);
            }
            c1086gP.T(z12);
            c1086gP.T(z13);
            list3 = list2;
            lVar6 = c2358g;
            j12 = j11;
        }
        c1105p0V2 = c1086gP.V();
        if (c1105p0V2 != null) {
            c1105p0V2.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$14(list3, lVar6, j12, lVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationKebab_cf5BqRc$lambda$0(HeaderMenuItem it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationKebab_cf5BqRc$lambda$1(MetricData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(androidx.compose.runtime.X isExpanded) {
        kotlin.jvm.internal.i.e(isExpanded, "$isExpanded");
        isExpanded.setValue(Boolean.FALSE);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final p293xa.r ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(androidx.compose.runtime.X isExpanded, Ia.l lVar) {
        kotlin.jvm.internal.i.e(isExpanded, "$isExpanded");
        isExpanded.setValue(Boolean.valueOf(!((Boolean) isExpanded.getValue()).booleanValue()));
        lVar.invoke(MetricData.MoreMenuClicked.INSTANCE);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationKebab_cf5BqRc$lambda$13$lambda$4(List list, Ia.l lVar, long j, Ia.l lVar2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        m181ConversationKebabcf5BqRc(list, lVar, j, lVar2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(Ia.l lVar, HeaderMenuItem menuItem, Ia.l lVar2) {
        kotlin.jvm.internal.i.e(menuItem, "$menuItem");
        lVar.invoke(menuItem);
        lVar2.invoke(metricData(menuItem, false));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationKebab_cf5BqRc$lambda$14(List list, Ia.l lVar, long j, Ia.l lVar2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        m181ConversationKebabcf5BqRc(list, lVar, j, lVar2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String badgeText(HeaderMenuItem headerMenuItem) {
        if (!(headerMenuItem instanceof HeaderMenuItem.Messages)) {
            return null;
        }
        String unreadMessagesCount = ((HeaderMenuItem.Messages) headerMenuItem).getUnreadMessagesCount();
        if (unreadMessagesCount.length() == 0) {
            return null;
        }
        return unreadMessagesCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int icon(HeaderMenuItem headerMenuItem) {
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            return io.intercom.android.sdk.R.drawable.intercom_inbox;
        }
        if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            return io.intercom.android.sdk.R.drawable.intercom_send_message_icon;
        }
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon;
        }
        if (headerMenuItem instanceof HeaderMenuItem.Help) {
            return io.intercom.android.sdk.R.drawable.intercom_help_centre_icon;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MetricData metricData(HeaderMenuItem headerMenuItem, boolean z10) {
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            return new MetricData.ConversationsInMoreMenuClicked(z10);
        }
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return new MetricData.TicketsInMoreMenuClicked(z10);
        }
        if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            return new MetricData.NewConversationInMoreMenuClicked(z10);
        }
        if (headerMenuItem instanceof HeaderMenuItem.Help) {
            return MetricData.HelpInMoreMenuClicked.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldShowUnreadDot(HeaderMenuItem headerMenuItem) {
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return ((HeaderMenuItem.Tickets) headerMenuItem).getHasUnreadTickets();
        }
        return false;
    }
}
