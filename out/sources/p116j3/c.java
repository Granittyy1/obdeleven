package p116j3;

import android.graphics.Color;
import com.airbnb.lottie.model.layer.a;
import p202q3.C2766j;

/* JADX INFO: compiled from: DropShadowKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a.InterfaceC0468a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f41096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f41097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f41098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f41099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f41100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41101g = true;

    public c(a.InterfaceC0468a interfaceC0468a, a aVar, C2766j c2766j) {
        this.f41095a = interfaceC0468a;
        a<Integer, Integer> aVarA = c2766j.f46053a.a();
        this.f41096b = (b) aVarA;
        aVarA.a(this);
        aVar.d(aVarA);
        a<Float, Float> aVarA2 = c2766j.f46054b.a();
        this.f41097c = (d) aVarA2;
        aVarA2.a(this);
        aVar.d(aVarA2);
        a<Float, Float> aVarA3 = c2766j.f46055c.a();
        this.f41098d = (d) aVarA3;
        aVarA3.a(this);
        aVar.d(aVarA3);
        a<Float, Float> aVarA4 = c2766j.f46056d.a();
        this.f41099e = (d) aVarA4;
        aVarA4.a(this);
        aVar.d(aVarA4);
        a<Float, Float> aVarA5 = c2766j.f46057e.a();
        this.f41100f = (d) aVarA5;
        aVarA5.a(this);
        aVar.d(aVarA5);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j3.a$a, java.lang.Object] */
    @Override // p116j3.a.InterfaceC0468a
    public final void a() {
        this.f41101g = true;
        this.f41095a.a();
    }

    public final void b(p092h3.a aVar) {
        if (this.f41101g) {
            this.f41101g = false;
            double dFloatValue = ((double) this.f41098d.e().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.f41099e.e().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f41096b.e().intValue();
            aVar.setShadowLayer(this.f41100f.e().floatValue(), fSin, fCos, Color.argb(Math.round(this.f41097c.e().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
