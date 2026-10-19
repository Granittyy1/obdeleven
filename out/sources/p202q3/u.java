package p202q3;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import p079g3.b;
import p116j3.i;
import p225s3.a;

/* JADX INFO: compiled from: KeyframesParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f46080a = JsonReader.a.a("k");

    public static ArrayList a(JsonReader jsonReader, b bVar, float f10, L l10, boolean z10) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.C() == JsonReader.Token.f23521g) {
            bVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.c();
        while (jsonReader.k()) {
            if (jsonReader.N(f46080a) != 0) {
                jsonReader.S();
            } else if (jsonReader.C() == JsonReader.Token.f23516b) {
                jsonReader.b();
                if (jsonReader.C() == JsonReader.Token.f23522h) {
                    arrayList.add(t.b(jsonReader, bVar, f10, l10, false, z10));
                } else {
                    while (jsonReader.k()) {
                        arrayList.add(t.b(jsonReader, bVar, f10, l10, true, z10));
                    }
                }
                jsonReader.h();
            } else {
                arrayList.add(t.b(jsonReader, bVar, f10, l10, false, z10));
            }
        }
        jsonReader.i();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i10;
        T t8;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            a aVar = (a) arrayList.get(i11);
            i11++;
            a aVar2 = (a) arrayList.get(i11);
            aVar.f46892h = Float.valueOf(aVar2.f46891g);
            if (aVar.f46887c == 0 && (t8 = aVar2.f46886b) != 0) {
                aVar.f46887c = t8;
                if (aVar instanceof i) {
                    ((i) aVar).d();
                }
            }
        }
        a aVar3 = (a) arrayList.get(i10);
        if ((aVar3.f46886b == 0 || aVar3.f46887c == 0) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
