package O6;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements L6.c {
    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        Map.Entry entry = (Map.Entry) obj;
        L6.d dVar2 = dVar;
        dVar2.a(com.google.firebase.encoders.proto.b.f28115g, entry.getKey());
        dVar2.a(com.google.firebase.encoders.proto.b.f28116h, entry.getValue());
    }
}
