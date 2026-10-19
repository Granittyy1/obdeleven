package p084g8;

import C8.a;
import androidx.collection.Y;
import com.obdeleven.service.model.DiagnosticSession;
import com.parse.ControlUnitDB;
import com.voltasit.parse.model.HistoryDB;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import p134k8.S0;
import p255u9.E;
import p293xa.d;

/* JADX INFO: compiled from: HistoryRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface b {
    @d
    a a(HistoryDB historyDB);

    HistoryDB b(JSONArray jSONArray, E e10, ControlUnitDB controlUnitDB);

    void c(String str, String str2);

    void d(String str, String str2, DiagnosticSession diagnosticSession, Y<S0> y10, Y<S0> y11);

    Object e(String str, String str2, ContinuationImpl continuationImpl);

    HistoryDB f(JSONArray jSONArray, E e10, ControlUnitDB controlUnitDB, String str, String str2);

    LinkedHashSet g();

    void h();

    void i(String str);

    Object j(int i10, int i11, boolean z10, E e10, List list, ContinuationImpl continuationImpl);

    HistoryDB k();
}
