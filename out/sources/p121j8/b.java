package p121j8;

import com.parse.ParseUser;
import com.voltasit.parse.model.ControlUnitLabelDB;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p255u9.u;
import p255u9.z;

/* JADX INFO: compiled from: Label.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Callable<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f41140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f41141e;

    public b(c cVar, int i10, String str, String str2) {
        this.f41141e = cVar;
        this.f41138b = i10;
        this.f41139c = str;
        this.f41140d = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        u uVar;
        String str;
        c cVar = this.f41141e;
        int i10 = this.f41138b;
        ControlUnitLabelDB controlUnitLabelDBB = cVar.b(i10);
        String str2 = this.f41139c;
        u uVarD = cVar.d(controlUnitLabelDBB, str2);
        ControlUnitLabelDB.Type type = cVar.f41142a;
        String str3 = this.f41140d;
        if (uVarD == null) {
            uVar = new u();
            uVar.put("language", str2);
            uVar.put("rating", 0);
            int i11 = z.f47484b;
            z zVar = (z) ParseUser.getCurrentUser();
            if (zVar != null) {
                uVar.put(Participant.USER_TYPE, zVar);
                uVar.getRelation("usersRated").add(zVar);
                uVar.f47481b = true;
            }
            if (controlUnitLabelDBB != null) {
                uVar.put("textId", controlUnitLabelDBB.getString("description"));
            } else {
                switch (type.ordinal()) {
                    case 0:
                        str = "MEAS";
                        break;
                    case 1:
                        str = "COD";
                        break;
                    case 2:
                        str = "LCOD";
                        break;
                    case 3:
                        str = "ADP";
                        break;
                    case 4:
                        str = "LADP";
                        break;
                    case 5:
                        str = "BST";
                        break;
                    case 6:
                        str = "OPT";
                        break;
                    default:
                        str = "N/A";
                        break;
                }
                uVar.put("textId", str);
            }
        } else {
            if (uVarD.getString("value").equals(str3)) {
                return null;
            }
            uVar = uVarD;
        }
        uVar.put("value", str3);
        uVar.save();
        if (uVarD != null) {
            return null;
        }
        String string = uVar.getString("textId");
        HashMap<String, HashMap<String, List<u>>> map = cVar.f41146e;
        HashMap<String, List<u>> map2 = map.get(string);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(uVar.getString("textId"), map2);
        }
        List<u> arrayList = map2.get(uVar.getString("language"));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map2.put(uVar.getString("language"), arrayList);
        }
        arrayList.add(uVar);
        if (controlUnitLabelDBB != null) {
            return null;
        }
        ControlUnitLabelDB controlUnitLabelDB = new ControlUnitLabelDB();
        controlUnitLabelDB.put("description", uVar.getString("textId"));
        controlUnitLabelDB.put("channel", Integer.valueOf(cVar.f41144c));
        controlUnitLabelDB.put("type", type.name());
        controlUnitLabelDB.put("value", Integer.valueOf(i10));
        controlUnitLabelDB.put("relationId", cVar.f41143b.getString("relationId"));
        cVar.f41145d.add(controlUnitLabelDB);
        controlUnitLabelDB.save();
        return null;
    }
}
