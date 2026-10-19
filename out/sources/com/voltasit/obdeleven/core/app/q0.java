package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.interfaces.IDevice;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ParseObject;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30149d;

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, int i10) {
        this.f30146a = i10;
        this.f30147b = obj;
        this.f30148c = obj2;
        this.f30149d = obj3;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws Exception {
        switch (this.f30146a) {
            case 0:
                return ((r0) this.f30147b).j((ControlUnit) this.f30148c, (String) this.f30149d);
            default:
                IDevice device = (IDevice) this.f30148c;
                kotlin.jvm.internal.i.e(device, "$device");
                BluetoothConnectionHelper this$0 = (BluetoothConnectionHelper) this.f30149d;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                if (task.isFaulted()) {
                    O.e.m(task.getError());
                    return Task.forResult(null);
                }
                Object result = task.getResult();
                kotlin.jvm.internal.i.d(result, "getResult(...)");
                boolean zBooleanValue = ((Boolean) result).booleanValue();
                MainActivity mainActivity = this$0.f34294a;
                if (!zBooleanValue) {
                    if (W7.c.d()) {
                        W7.c.b();
                    }
                    W7.c.g(0);
                    mainActivity.U();
                    throw new Exception("Aborting connection process");
                }
                p255u9.z zVar = (p255u9.z) this.f30147b;
                kotlin.jvm.internal.i.b(zVar);
                String deviceId = device.e().f3516a;
                kotlin.jvm.internal.i.e(deviceId, "deviceId");
                Iterable list = zVar.getList("devices");
                if (list == null) {
                    list = EmptyList.f42983b;
                }
                Iterable iterable = list;
                ArrayList arrayList = new ArrayList(kotlin.collections.m.y(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ParseObject) it.next()).getObjectId());
                }
                if (!arrayList.contains(deviceId)) {
                    ParseObject parseObject = new ParseObject("Devices");
                    parseObject.setObjectId(deviceId);
                    zVar.addUnique("devices", parseObject);
                    zVar.saveInBackground();
                }
                return mainActivity.I(device);
        }
    }
}
