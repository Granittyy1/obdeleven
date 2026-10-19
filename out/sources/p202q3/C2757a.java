package p202q3;

import U5.d;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.a;
import java.io.IOException;
import java.util.ArrayList;
import p079g3.b;
import p116j3.i;
import p154m3.h;
import p154m3.k;
import p214r3.g;

/* JADX INFO: renamed from: q3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimatablePathValueParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f46041a = JsonReader.a.a("k", "x", "y");

    public static d a(a aVar, b bVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (aVar.C() == JsonReader.Token.f23516b) {
            aVar.b();
            while (aVar.k()) {
                arrayList.add(new i(bVar, t.b(aVar, bVar, g.c(), y.f46089a, aVar.C() == JsonReader.Token.f23518d, false)));
            }
            aVar.h();
            u.b(arrayList);
        } else {
            arrayList.add(new p225s3.a(s.b(aVar, g.c())));
        }
        return new d(arrayList);
    }

    public static k b(a aVar, b bVar) throws IOException {
        aVar.c();
        d dVarA = null;
        p154m3.b bVarB = null;
        boolean z10 = false;
        p154m3.b bVarB2 = null;
        while (aVar.C() != JsonReader.Token.f23519e) {
            int iN = aVar.N(f46041a);
            if (iN != 0) {
                JsonReader.Token token = JsonReader.Token.f23521g;
                if (iN != 1) {
                    if (iN != 2) {
                        aVar.R();
                        aVar.S();
                    } else if (aVar.C() == token) {
                        aVar.S();
                        z10 = true;
                    } else {
                        bVarB = C2760d.b(aVar, bVar, true);
                    }
                } else if (aVar.C() == token) {
                    aVar.S();
                    z10 = true;
                } else {
                    bVarB2 = C2760d.b(aVar, bVar, true);
                }
            } else {
                dVarA = a(aVar, bVar);
            }
        }
        aVar.i();
        if (z10) {
            bVar.a("Lottie doesn't support expressions.");
        }
        return dVarA != null ? dVarA : new h(bVarB2, bVarB);
    }
}
