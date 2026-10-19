package p169n8;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.fault.Fault;
import java.util.Locale;

/* JADX INFO: compiled from: KW1281Fault.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Fault {
    public b(ControlUnit controlUnit, String str) {
        this.f29431b = controlUnit;
        this.f29432c = str.substring(0, 4);
        this.f29435f = str.substring(4);
        int i10 = Integer.parseInt(this.f29432c, 16);
        int i11 = Integer.parseInt(this.f29435f, 16);
        this.f29436g = i11 & 127;
        this.f29438i = (i11 >> 7) != 0 ? 1 : 3;
        if ((i10 >> 14) != 1) {
            this.f29433d = String.format(Locale.US, "%05d", Integer.valueOf(i10));
            return;
        }
        int i12 = (i10 >> 12) & 3;
        if (i12 == 0) {
            this.f29433d = "P";
        } else if (i12 == 1) {
            this.f29433d = "C";
        } else if (i12 == 2) {
            this.f29433d = "B";
        } else if (i12 == 3) {
            this.f29433d = "U";
        }
        this.f29433d += ((i10 >> 10) & 3);
        this.f29433d += String.format(Locale.US, "%03d", Integer.valueOf(i10 & 1023));
    }

    @Override // com.obdeleven.service.model.fault.Fault
    public final ApplicationProtocol b() {
        return ApplicationProtocol.f29262b;
    }
}
