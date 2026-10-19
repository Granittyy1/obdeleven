package p109i8;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.fault.Fault;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.HistoryDB;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public interface e extends f {
    Task<Boolean> a();

    Task<Boolean> c();

    ControlUnitDB d();

    Task<Boolean> e();

    void f();

    ApplicationProtocol i();

    Task<Boolean> k();

    Task<Void> l();

    Task<List<Fault>> o(boolean z10, boolean z11);

    ArrayList q();

    ControlUnit.RequestSID s();

    HistoryDB u(List<Fault> list);
}
