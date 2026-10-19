package p121j8;

import com.parse.ParseUser;
import com.voltasit.parse.model.ControlUnitLabelDB;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p255u9.u;
import p255u9.z;

/* JADX INFO: compiled from: LongCodingLabel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Callable<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f41150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f41151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f41152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f41153h;

    public d(e eVar, int i10, int i11, int i12, String str, String str2, int i13) {
        this.f41153h = eVar;
        this.f41147b = i10;
        this.f41148c = i11;
        this.f41149d = i12;
        this.f41150e = str;
        this.f41151f = str2;
        this.f41152g = i13;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        int i10;
        int i11;
        int i12;
        ControlUnitLabelDB controlUnitLabelDB;
        u uVar;
        int i13;
        e eVar = this.f41153h;
        Iterator it = eVar.f41155b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i10 = this.f41147b;
            i11 = this.f41148c;
            i12 = this.f41149d;
            if (!zHasNext) {
                controlUnitLabelDB = null;
                break;
            }
            controlUnitLabelDB = (ControlUnitLabelDB) it.next();
            int i14 = controlUnitLabelDB.getInt("channel");
            int i15 = controlUnitLabelDB.getInt("bit");
            int i16 = controlUnitLabelDB.getInt("value");
            if (i14 == i10 && i15 == i11 && i16 == i12) {
                break;
            }
        }
        String str = this.f41150e;
        u uVarD = eVar.d(controlUnitLabelDB, str);
        String str2 = this.f41151f;
        if (uVarD == null) {
            uVar = new u();
            uVar.put("language", str);
            i13 = i12;
            uVar.put("rating", 0);
            int i17 = z.f47484b;
            z zVar = (z) ParseUser.getCurrentUser();
            if (zVar != null) {
                uVar.put(Participant.USER_TYPE, zVar);
                uVar.getRelation("usersRated").add(zVar);
                uVar.f47481b = true;
            }
            if (controlUnitLabelDB != null) {
                uVar.put("textId", controlUnitLabelDB.getString("description"));
            } else {
                uVar.put("textId", "LCOD");
            }
        } else {
            if (uVarD.getString("value").equals(str2)) {
                return null;
            }
            i13 = i12;
            uVar = uVarD;
        }
        uVar.put("value", str2);
        uVar.save();
        if (uVarD != null) {
            return null;
        }
        String string = uVar.getString("textId");
        HashMap map = eVar.f41156c;
        HashMap map2 = (HashMap) map.get(string);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(uVar.getString("textId"), map2);
        }
        List arrayList = (List) map2.get(uVar.getString("language"));
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(uVar.getString("language"), arrayList);
        }
        arrayList.add(uVar);
        if (controlUnitLabelDB != null) {
            return null;
        }
        ControlUnitLabelDB controlUnitLabelDB2 = new ControlUnitLabelDB();
        controlUnitLabelDB2.put("description", uVar.getString("textId"));
        controlUnitLabelDB2.put("channel", Integer.valueOf(i10));
        controlUnitLabelDB2.put("bit", Integer.valueOf(i11));
        controlUnitLabelDB2.put("bitLength", Integer.valueOf(this.f41152g));
        controlUnitLabelDB2.put("type", "LONG_CODING");
        controlUnitLabelDB2.put("value", Integer.valueOf(i13));
        controlUnitLabelDB2.put("relationId", eVar.f41154a.getString("relationId"));
        eVar.f41155b.add(controlUnitLabelDB2);
        controlUnitLabelDB2.save();
        return null;
    }
}
