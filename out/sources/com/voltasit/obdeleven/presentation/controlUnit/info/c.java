package com.voltasit.obdeleven.presentation.controlUnit.info;

import J8.p;
import androidx.lifecycle.C;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.TransportProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.controlUnit.GetControlUnitOdxVersionUC;
import com.voltasit.obdeleven.domain.usecases.controlUnit.UpdateControlUnitOdxVersionUC;
import com.voltasit.parse.model.CodingType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q;
import kotlin.text.n;

/* JADX INFO: compiled from: ControlUnitInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.odx.i f31631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J8.d f31632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A8.g f31633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final UpdateControlUnitOdxVersionUC f31634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final GetControlUnitOdxVersionUC f31635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f31636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final J8.a f31637u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C<List<h>> f31638v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C f31639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U7.a<h> f31640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final U7.a f31641y;

    /* JADX INFO: compiled from: ControlUnitInfoViewModel.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f31643b;

        static {
            int[] iArr = new int[CodingType.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[TransportProtocol.values().length];
            try {
                iArr2[5] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[4] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[1] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[2] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[0] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            f31642a = iArr2;
            int[] iArr3 = new int[ApplicationProtocol.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[4] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            f31643b = iArr3;
        }
    }

    public c(com.voltasit.obdeleven.domain.usecases.odx.i iVar, J8.d dVar, A8.g gVar, UpdateControlUnitOdxVersionUC updateControlUnitOdxVersionUC, GetControlUnitOdxVersionUC getControlUnitOdxVersionUC, p pVar, J8.a aVar) {
        this.f31631o = iVar;
        this.f31632p = dVar;
        this.f31633q = gVar;
        this.f31634r = updateControlUnitOdxVersionUC;
        this.f31635s = getControlUnitOdxVersionUC;
        this.f31636t = pVar;
        this.f31637u = aVar;
        C<List<h>> c10 = new C<>();
        this.f31638v = c10;
        this.f31639w = c10;
        U7.a<h> aVar2 = new U7.a<>();
        this.f31640x = aVar2;
        this.f31641y = aVar2;
    }

    public final void b(int i10, String str, ArrayList arrayList) {
        if (n.S(str)) {
            return;
        }
        arrayList.add(new h(this.f31632p.a(i10, new Object[0]), null, null, str, null, 22));
    }

    public final h c(String str) {
        List<h> listD = this.f31638v.d();
        ArrayList arrayListP0 = listD != null ? q.p0(listD) : new ArrayList();
        Iterator it = arrayListP0.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.i.a(((h) it.next()).f31658a, str)) {
                return (h) arrayListP0.get(i10);
            }
            i10++;
        }
        i10 = -1;
        return (h) arrayListP0.get(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String d(ControlUnit controlUnit) {
        GetControlUnitOdxVersionUC getControlUnitOdxVersionUC = this.f31635s;
        getControlUnitOdxVersionUC.getClass();
        kotlin.jvm.internal.i.e(controlUnit, "controlUnit");
        getControlUnitOdxVersionUC.f30643b.f("GetControlUnitOdxVersionUC", androidx.compose.foundation.gestures.d.b("GetControlUnitOdxVersionUC(controlUnit=", controlUnit.t(), ")"));
        String strA = getControlUnitOdxVersionUC.f30642a.a(controlUnit.n().shortValue());
        C8.a c0024a = strA.length() == 0 ? new C8.a.C0024a(GetControlUnitOdxVersionUC.OdxVersionNotSelectedException.f30644b) : new C8.a.b(strA);
        if (c0024a instanceof C8.a.b) {
            return (String) ((C8.a.b) c0024a).f2463a;
        }
        if (c0024a instanceof C8.a.C0024a) {
            return this.f31632p.a(R.string.common_use_latest, new Object[0]);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void e(String str, h hVar) {
        C<List<h>> c10 = this.f31638v;
        List<h> listD = c10.d();
        ArrayList arrayListP0 = listD != null ? q.p0(listD) : new ArrayList();
        Iterator<h> it = arrayListP0.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.i.a(it.next().f31658a, str)) {
                arrayListP0.set(i10, hVar);
                c10.j(arrayListP0);
            }
            i10++;
        }
        i10 = -1;
        arrayListP0.set(i10, hVar);
        c10.j(arrayListP0);
    }
}
