package p134k8;

import O.e;
import Q8.d;
import androidx.compose.foundation.gestures.snapping.f;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.CodingType;
import java.util.Locale;

/* JADX INFO: compiled from: KWP2000SubSystem1A.java */
/* JADX INFO: loaded from: classes3.dex */
public final class X0 implements D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControlUnit f42694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f42699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f42700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CodingType f42701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42702i;
    public String j;

    /* JADX INFO: compiled from: KWP2000SubSystem1A.java */
    public class a implements Continuation<Boolean, Task<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f42703a;

        public a(String str) {
            this.f42703a = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Integer> then(Task<Boolean> task) throws Exception {
            if (!task.getResult().booleanValue()) {
                return Task.forResult(-1);
            }
            X0 x10 = X0.this;
            return x10.f42694a.f29335r.d(String.format(Locale.US, "3B9A059738DE%s%s2%1X%06X", I.b.j(), com.obdeleven.service.util.b.c(x10.f42694a.f29320b.getSWVersion()), Integer.valueOf(x10.f42695b & 15), Integer.valueOf(Integer.parseInt(this.f42703a)))).continueWith(new W0(this));
        }
    }

    /* JADX INFO: compiled from: KWP2000SubSystem1A.java */
    public class b implements Continuation<Boolean, Task<Boolean>> {
        public b() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Boolean> then(Task<Boolean> task) throws Exception {
            return task.getResult().booleanValue() ? X0.this.f42694a.f29335r.d("1A9A").continueWith(new Y0(this)) : Task.forResult(Boolean.FALSE);
        }
    }

    /* JADX INFO: compiled from: KWP2000SubSystem1A.java */
    public class c implements Continuation<Boolean, Task<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f42706a;

        public c(String str) {
            this.f42706a = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Integer> then(Task<Boolean> task) throws Exception {
            if (!task.getResult().booleanValue()) {
                return Task.forResult(-1);
            }
            X0 x10 = X0.this;
            String strC = com.obdeleven.service.util.b.c(x10.f42694a.f29320b.getSWVersion());
            StringBuilder sb2 = new StringBuilder("3B9A0594E8DE");
            sb2.append(I.b.j());
            sb2.append(strC);
            sb2.append(x10.j);
            return x10.f42694a.f29335r.d(d.a(sb2, this.f42706a, "FF")).continueWith(new Z0(this));
        }
    }

    public X0(ControlUnit controlUnit, String str) {
        this.f42694a = controlUnit;
        String strSubstring = str.substring(2);
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(controlUnit, sb2, "_", "_");
        sb2.append(this.f42695b);
        String string = sb2.toString();
        Locale locale = Locale.US;
        e.j(string, "parseInfo(" + strSubstring + ")");
        this.f42697d = com.obdeleven.service.util.b.b(String.format(locale, "%02X", Integer.valueOf(Integer.parseInt(strSubstring.substring(0, 2), 16) & 127)) + strSubstring.substring(2, 24)).trim();
        this.f42698e = com.obdeleven.service.util.b.b(String.format(locale, "%02X", Integer.valueOf(Integer.parseInt(strSubstring.substring(24, 26), 16) & 127)) + strSubstring.substring(26, 32)).trim();
        int i10 = Integer.parseInt(strSubstring.substring(32, 34), 16);
        this.f42695b = i10 & 15;
        int i11 = (i10 >> 4) & 15;
        if (i11 == 2) {
            int i12 = Integer.parseInt(strSubstring.substring(34, 40), 16);
            this.f42701h = CodingType.f34405e;
            this.f42702i = String.format(locale, "%07d", Integer.valueOf(i12));
        } else if (i11 != 3) {
            this.f42701h = CodingType.f34403c;
            this.f42702i = "";
        } else {
            this.f42701h = CodingType.f34406f;
        }
        this.f42696c = com.obdeleven.service.util.b.b(strSubstring.substring(52, 92)).trim();
        this.f42699f = "";
        this.f42700g = "";
        e.j("KWP2000SubSystem1A", "DATA: ".concat(str));
    }

    @Override // p134k8.D1
    public final Task<Boolean> a() {
        return this.f42694a.a();
    }

    @Override // p134k8.D1
    public final String b() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42694a, sb2, "_", "_");
        androidx.compose.foundation.gestures.d.d(sb2, this.f42695b, "getSerialNumber()");
        String str = this.f42700g;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final Task<Boolean> c() {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42694a, sb2, "_", "_");
        androidx.compose.foundation.gestures.d.d(sb2, this.f42695b, "identifyInfo()");
        return Task.forResult(Boolean.TRUE);
    }

    @Override // p134k8.D1
    public final String d() {
        String str = this.f42696c;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final Task<Boolean> e() {
        StringBuilder sb2 = new StringBuilder();
        ControlUnit controlUnit = this.f42694a;
        sb2.append(controlUnit.t());
        sb2.append("_");
        sb2.append(controlUnit.getName());
        sb2.append("_");
        sb2.append(this.f42695b);
        e.j(sb2.toString(), "readLongCoding()");
        return s().continueWithTask(new b());
    }

    @Override // p134k8.D1
    public final Task<Integer> f(String str) {
        StringBuilder sb2 = new StringBuilder();
        ControlUnit controlUnit = this.f42694a;
        sb2.append(controlUnit.t());
        sb2.append("_");
        sb2.append(controlUnit.getName());
        sb2.append("_");
        sb2.append(this.f42695b);
        e.j(sb2.toString(), "writeCoding(" + str + ")");
        return this.f42701h != CodingType.f34405e ? Task.forResult(-1) : s().continueWithTask(new a(str));
    }

    @Override // p134k8.D1
    public final Task<Boolean> g() {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42694a, sb2, "_", "_");
        androidx.compose.foundation.gestures.d.d(sb2, this.f42695b, "readCoding()");
        return this.f42701h == CodingType.f34406f ? Task.forResult(Boolean.FALSE) : c();
    }

    @Override // p134k8.D1
    public final int getId() {
        return this.f42695b;
    }

    @Override // p134k8.D1
    public final ControlUnit h() {
        return this.f42694a;
    }

    @Override // p134k8.D1
    public final String i() {
        String str = this.f42698e;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final String j() {
        String str = this.f42697d;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final CodingType k() {
        CodingType codingType = this.f42701h;
        if (codingType == null || codingType == CodingType.f34402b) {
            return null;
        }
        return codingType;
    }

    @Override // p134k8.D1
    public final String l() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42694a, sb2, "_", "_");
        androidx.compose.foundation.gestures.d.d(sb2, this.f42695b, "getSWNumber()");
        String str = this.f42697d;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final String m() {
        String str = this.f42699f;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final String n() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42694a, sb2, "_", "_");
        androidx.compose.foundation.gestures.d.d(sb2, this.f42695b, "getHWVersion()");
        String str = this.f42699f;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final String o() {
        t();
        return "";
    }

    @Override // p134k8.D1
    public final String p() {
        String str = this.f42700g;
        return str == null ? "" : str;
    }

    @Override // p134k8.D1
    public final f q() throws ControlUnitException {
        String str;
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42694a, sb2, "_", "_");
        sb2.append(this.f42695b);
        e.j(sb2.toString(), "getCoding()");
        if (v() != CodingType.f34405e || (str = this.f42702i) == null) {
            throw new ControlUnitException(2);
        }
        return new f(str, null);
    }

    @Override // p134k8.D1
    public final C2642q1 r() {
        String str;
        if (k() == CodingType.f34406f && (str = this.f42702i) != null) {
            return new C2642q1(str);
        }
        C2642q1 c2642q1 = new C2642q1();
        c2642q1.f42831c = "".toUpperCase();
        return c2642q1;
    }

    @Override // p134k8.D1
    public final Task<Boolean> s() {
        return this.f42694a.D(false);
    }

    @Override // p134k8.D1
    public final String t() {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42694a, sb2, "_", "_");
        androidx.compose.foundation.gestures.d.d(sb2, this.f42695b, "getHWNumber()");
        return "";
    }

    @Override // p134k8.D1
    public final String u() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42694a, sb2, "_", "_");
        androidx.compose.foundation.gestures.d.d(sb2, this.f42695b, "getSystemDescription()");
        String str = this.f42696c;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }

    @Override // p134k8.D1
    public final CodingType v() throws ControlUnitException {
        CodingType codingType = this.f42701h;
        if (codingType == null || codingType == CodingType.f34402b) {
            throw new ControlUnitException(2);
        }
        return codingType;
    }

    @Override // p134k8.D1
    public final Task<Integer> w(String str) {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42694a, sb2, "_", "_");
        androidx.compose.foundation.gestures.d.d(sb2, this.f42695b, "writeLongCoding()");
        return this.f42701h != CodingType.f34406f ? Task.forResult(-1) : s().continueWithTask(new c(str));
    }

    @Override // p134k8.D1
    public final C2642q1 x() throws ControlUnitException {
        String str;
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42694a, sb2, "_", "_");
        sb2.append(this.f42695b);
        e.j(sb2.toString(), "getLongCoding()");
        if (v() != CodingType.f34406f || (str = this.f42702i) == null) {
            throw new ControlUnitException(2);
        }
        C2642q1 c2642q1 = new C2642q1();
        c2642q1.f42831c = str.toUpperCase();
        return c2642q1;
    }

    @Override // p134k8.D1
    public final f y() {
        String str;
        Object obj = null;
        return (k() != CodingType.f34405e || (str = this.f42702i) == null) ? new f("", obj) : new f(str, obj);
    }

    @Override // p134k8.D1
    public final String z() throws ControlUnitException {
        StringBuilder sb2 = new StringBuilder();
        com.obdeleven.service.core.b.c(this.f42694a, sb2, "_", "_");
        androidx.compose.foundation.gestures.d.d(sb2, this.f42695b, "getSWVersion()");
        String str = this.f42698e;
        if (str != null) {
            return str;
        }
        throw new ControlUnitException(0);
    }
}
