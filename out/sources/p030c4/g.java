package p030c4;

import D7.h;
import Z3.I;
import Z3.q;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.compose.material.ripple.k;
import kotlin.jvm.internal.i;
import p165n4.j;

/* JADX INFO: compiled from: ViewIndexingTrigger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f22332a;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        i.e(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        i.e(event, "event");
        h hVar = this.f22332a;
        if (hVar == null) {
            return;
        }
        float[] fArr = event.values;
        boolean z10 = false;
        double d10 = fArr[0] / 9.80665f;
        double d11 = fArr[1] / 9.80665f;
        double d12 = fArr[2] / 9.80665f;
        if (Math.sqrt((d12 * d12) + (d11 * d11) + (d10 * d10)) > 2.3d) {
            String str = (String) hVar.f2848d;
            j jVar = (j) hVar.f2847c;
            if (jVar != null && jVar.f44901g) {
                z10 = true;
            }
            q qVar = q.f7852a;
            I.f7769a.getClass();
            I.c();
            boolean zA = I.f7775g.a();
            if (z10 && zA) {
                g gVar = b.f22300a;
                if (b.f22306g) {
                    return;
                }
                b.f22306g = true;
                q.c().execute(new k(3, str));
            }
        }
    }
}
