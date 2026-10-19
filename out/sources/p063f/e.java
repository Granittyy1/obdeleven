package p063f;

import androidx.activity.result.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f34892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f34893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p076g.a<Object, Object> f34894c;

    public e(a aVar, String str, p076g.a<Object, Object> aVar2) {
        this.f34892a = aVar;
        this.f34893b = str;
        this.f34894c = aVar2;
    }

    @Override // p063f.c
    public final void a(Object obj) throws Exception {
        a aVar = this.f34892a;
        LinkedHashMap linkedHashMap = aVar.f8256b;
        String str = this.f34893b;
        Object obj2 = linkedHashMap.get(str);
        p076g.a<Object, Object> aVar2 = this.f34894c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        ArrayList arrayList = aVar.f8258d;
        arrayList.add(str);
        try {
            aVar.b(iIntValue, aVar2, obj);
        } catch (Exception e10) {
            arrayList.remove(str);
            throw e10;
        }
    }
}
