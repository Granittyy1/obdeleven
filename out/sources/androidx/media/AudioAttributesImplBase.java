package androidx.media;

import J4.i;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17860a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17861b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17862c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17863d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f17861b == audioAttributesImplBase.f17861b) {
            int i11 = this.f17862c;
            int i12 = audioAttributesImplBase.f17862c;
            int i13 = audioAttributesImplBase.f17863d;
            if (i13 == -1) {
                int i14 = audioAttributesImplBase.f17860a;
                int i15 = AudioAttributesCompat.f17856b;
                if ((i12 & 1) != 1) {
                    if ((i12 & 4) != 4) {
                        switch (i14) {
                            case 2:
                                i10 = 0;
                                break;
                            case 3:
                                i10 = 8;
                                break;
                            case 4:
                                i10 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i10 = 5;
                                break;
                            case 6:
                                i10 = 2;
                                break;
                            case 11:
                                i10 = 10;
                                break;
                            case 12:
                            default:
                                i10 = 3;
                                break;
                            case 13:
                                i10 = 1;
                                break;
                        }
                    } else {
                        i10 = 6;
                    }
                } else {
                    i10 = 7;
                }
            } else {
                i10 = i13;
            }
            if (i10 == 6) {
                i12 |= 4;
            } else if (i10 == 7) {
                i12 |= 1;
            }
            if (i11 == (i12 & 273) && this.f17860a == audioAttributesImplBase.f17860a && this.f17863d == i13) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17861b), Integer.valueOf(this.f17862c), Integer.valueOf(this.f17860a), Integer.valueOf(this.f17863d)});
    }

    public final String toString() {
        String strB;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f17863d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f17863d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f17860a;
        int i11 = AudioAttributesCompat.f17856b;
        switch (i10) {
            case 0:
                strB = "USAGE_UNKNOWN";
                break;
            case 1:
                strB = "USAGE_MEDIA";
                break;
            case 2:
                strB = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strB = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strB = "USAGE_ALARM";
                break;
            case 5:
                strB = "USAGE_NOTIFICATION";
                break;
            case 6:
                strB = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strB = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strB = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strB = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strB = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strB = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strB = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strB = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strB = "USAGE_GAME";
                break;
            case 15:
            default:
                strB = i.b(i10, "unknown usage ");
                break;
            case 16:
                strB = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strB);
        sb2.append(" content=");
        sb2.append(this.f17861b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f17862c).toUpperCase());
        return sb2.toString();
    }
}
