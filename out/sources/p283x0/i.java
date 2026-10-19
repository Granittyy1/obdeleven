package p283x0;

import A0.a;
import androidx.collection.X;
import java.util.ArrayList;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements a<j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47860a;

    public i(String str) {
        this.f47860a = str;
    }

    @Override // A0.a
    public final void a(j.a aVar) {
        j.a aVar2 = aVar;
        synchronized (j.f47863c) {
            try {
                X<String, ArrayList<a<j.a>>> x10 = j.f47864d;
                ArrayList<a<j.a>> arrayList = x10.get(this.f47860a);
                if (arrayList == null) {
                    return;
                }
                x10.remove(this.f47860a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).a(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
