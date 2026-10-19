package com.voltasit.obdeleven.ui.dialogs;

import com.obdeleven.service.model.OBDIIService01;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: OBDIILiveDataChartDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2167r0 extends Y {
    @Override // com.voltasit.obdeleven.ui.dialogs.Y
    public final void B(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f33865v.add(getString(OBDIIService01.valueOf((String) it.next()).getDescription()));
        }
    }
}
