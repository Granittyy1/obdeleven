package p134k8;

import androidx.compose.foundation.gestures.snapping.f;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.CodingType;

/* JADX INFO: compiled from: Subsystem.java */
/* JADX INFO: loaded from: classes3.dex */
public interface D1 {
    Task<Boolean> a();

    String b() throws ControlUnitException;

    Task<Boolean> c();

    String d();

    Task<Boolean> e();

    Task<Integer> f(String str);

    Task<Boolean> g();

    int getId();

    ControlUnit h();

    String i();

    String j();

    CodingType k();

    String l() throws ControlUnitException;

    String m();

    String n() throws ControlUnitException;

    String o();

    String p();

    f q() throws ControlUnitException;

    C2642q1 r();

    Task<Boolean> s();

    String t() throws ControlUnitException;

    String u() throws ControlUnitException;

    CodingType v() throws ControlUnitException;

    Task<Integer> w(String str);

    C2642q1 x() throws ControlUnitException;

    f y();

    String z() throws ControlUnitException;
}
