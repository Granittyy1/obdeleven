package Tb;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: BasicContainer.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f6057b;

    public final void b(b bVar) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(this.f6057b);
            this.f6057b = arrayList;
            arrayList.add(bVar);
        }
    }

    public final long c() {
        long size = 0;
        for (int i10 = 0; i10 < this.f6057b.size(); i10++) {
            size += ((b) this.f6057b.get(i10)).getSize();
        }
        return size;
    }

    public final void h(WritableByteChannel writableByteChannel) throws IOException {
        Iterator it = this.f6057b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).getBox(writableByteChannel);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.f6057b.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(this.f6057b.get(i10));
        }
        sb2.append("]");
        return sb2.toString();
    }
}
