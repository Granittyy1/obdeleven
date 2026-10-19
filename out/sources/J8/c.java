package J8;

import com.obdeleven.service.interfaces.IDevice;
import java.util.List;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: BluetoothProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface c {
    void a(com.voltasit.obdeleven.utils.bluetooth.g gVar, com.voltasit.obdeleven.utils.bluetooth.n nVar);

    StateFlowImpl b();

    boolean c();

    boolean d();

    List<Q8.b> e();

    void f();

    void g(int i10, IDevice iDevice, Throwable th);

    kotlinx.coroutines.flow.v h();

    void i();
}
