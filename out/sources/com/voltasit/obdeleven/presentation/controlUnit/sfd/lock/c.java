package com.voltasit.obdeleven.presentation.controlUnit.sfd.lock;

import Ia.p;
import S4.o;
import android.content.Context;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.MaterialThemeKt;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: LockSfdDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final void a(final int i10, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(101075832);
        if ((i11 & 14) == 0) {
            i12 = (c1086gP.h(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            MaterialThemeKt.a(e.f32277b, e.f32276a, null, androidx.compose.runtime.internal.a.b(1223590436, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.sfd.lock.LockSfdDialogKt$LockSfdDialogContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) throws ParseException {
                    String str;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        h.a aVar = h.a.f13984b;
                        h hVarH = PaddingKt.h(aVar, 24, 0.0f, 2);
                        int i13 = i10;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarH);
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
                        Date date = new SimpleDateFormat("mm", Locale.getDefault()).parse(String.valueOf(i13));
                        if (date == null) {
                            str = "";
                        } else {
                            str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date);
                            i.d(str, "format(...)");
                        }
                        interfaceC1084f3.x(AndroidCompositionLocals_androidKt.f14792a);
                        String string = ((Context) interfaceC1084f3.x(AndroidCompositionLocals_androidKt.f14793b)).getResources().getString(R.string.dialog_sfd_lock_time_left, Arrays.copyOf(new Object[]{str}, 1));
                        long jG = G0.a.g(12);
                        long j = e.a.f32292p;
                        TextKt.b(string, null, j, jG, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3456, 0, 131058);
                        Lb.a.a(interfaceC1084f3, W.e(aVar, 16));
                        TextKt.b(o.p(interfaceC1084f3, R.string.dialog_sfd_lock_message), null, j, G0.a.g(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3456, 0, 131058);
                        interfaceC1084f3.J();
                    }
                    return r.f47939a;
                }
            }, c1086gP), c1086gP, 3120, 4);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.sfd.lock.LockSfdDialogKt$LockSfdDialogContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    c.a(i10, interfaceC1084f2, L4.b.l(i11 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
