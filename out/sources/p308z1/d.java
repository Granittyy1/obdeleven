package p308z1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: compiled from: OrientationListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f48710a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f48711b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f48712c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f48713d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Display f48714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a[] f48715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48716g;

    /* JADX INFO: compiled from: OrientationListener.java */
    public interface a {
        void a(float f10, float[] fArr);
    }

    public d(Display display, a... aVarArr) {
        this.f48714e = display;
        this.f48715f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f48710a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f48714e.getRotation();
        float[] fArr3 = this.f48711b;
        if (rotation != 0) {
            int i11 = 129;
            if (rotation != 1) {
                i10 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i11 = 130;
                    i10 = 1;
                }
            } else {
                i10 = 129;
                i11 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i11, i10, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f48713d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f10 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z10 = this.f48716g;
        float[] fArr5 = this.f48712c;
        if (!z10) {
            c.a(fArr5, fArr2);
            this.f48716g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        a[] aVarArr = this.f48715f;
        for (int i12 = 0; i12 < 2; i12++) {
            aVarArr[i12].a(f10, fArr2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
