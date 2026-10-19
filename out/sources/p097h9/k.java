package p097h9;

import com.obdeleven.service.model.UDSResult;
import com.parse.ParseException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import p255u9.j;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36214c;

    public /* synthetic */ k(int i10, Object obj) {
        this.f36213b = i10;
        this.f36214c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ParseException {
        switch (this.f36213b) {
            case 0:
                r rVar = (r) this.f36214c;
                rVar.f36229o.delete();
                Iterator it = rVar.f36231q.f36795b.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).delete();
                }
                Iterator it2 = rVar.f36231q.f36206h.iterator();
                while (it2.hasNext()) {
                    ((j) it2.next()).delete();
                }
                return null;
            default:
                return UDSResult.a(((String) this.f36214c).substring(4));
        }
    }
}
