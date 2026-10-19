package p175o1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.compose.ui.platform.C1253x;
import com.google.android.play.integrity.internal.k;
import com.google.common.collect.C;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p019b6.d;
import p078g1.C2198d;
import p078g1.n;
import p078g1.t;
import p114j1.A;

/* JADX INFO: compiled from: AudioCapabilities.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45052c = new a(ImmutableList.M(C0512a.f45057d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableList<Integer> f45053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableMap<Integer, Integer> f45054e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<C0512a> f45055a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45056b;

    static {
        Object[] objArr = {2, 5, 6};
        d.b(3, objArr);
        f45053d = ImmutableList.A(3, objArr);
        ImmutableMap.a aVar = new ImmutableMap.a(4);
        aVar.b(5, 6);
        aVar.b(17, 6);
        aVar.b(7, 6);
        aVar.b(30, 10);
        aVar.b(18, 6);
        aVar.b(6, 8);
        aVar.b(8, 8);
        aVar.b(14, 8);
        f45054e = aVar.a();
    }

    public a(List<C0512a> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C0512a c0512a = list.get(i10);
            this.f45055a.put(c0512a.f45058a, c0512a);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f45055a.size(); i11++) {
            iMax = Math.max(iMax, this.f45055a.valueAt(i11).f45059b);
        }
        this.f45056b = iMax;
    }

    public static ImmutableList<C0512a> a(int[] iArr, int i10) {
        ImmutableList.b bVar = ImmutableList.f27874c;
        ImmutableList.a aVar = new ImmutableList.a();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            aVar.c(new C0512a(i11, i10));
        }
        return aVar.h();
    }

    /* JADX WARN: Code duplicated, block: B:88:0x023c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0244  */
    /* JADX WARN: Multi-variable type inference failed */
    public static a b(Context context, Intent intent, C2198d c2198d, k kVar) {
        AudioManager audioManagerA = p090h1.d.a(context);
        if (kVar == null) {
            k kVar2 = null;
            if (A.f40996a >= 33) {
                try {
                    List audioDevicesForAttributes = audioManagerA.getAudioDevicesForAttributes(c2198d.a().f35246a);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        kVar2 = new k((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
            kVar = kVar2;
        }
        int i10 = A.f40996a;
        ImmutableMap<Integer, Integer> immutableMap = f45054e;
        if (i10 >= 33 && (A.E(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            List directProfilesForAttributes = audioManagerA.getDirectProfilesForAttributes(c2198d.a().f35246a);
            HashMap map = new HashMap();
            map.put(2, new HashSet(Ints.i0(12)));
            for (int i11 = 0; i11 < directProfilesForAttributes.size(); i11++) {
                AudioProfile audioProfileA = C1253x.a(directProfilesForAttributes.get(i11));
                if (audioProfileA.getEncapsulationType() != 1) {
                    int format = audioProfileA.getFormat();
                    if (A.C(format) || immutableMap.containsKey(Integer.valueOf(format))) {
                        if (map.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) map.get(Integer.valueOf(format));
                            set.getClass();
                            set.addAll(Ints.i0(audioProfileA.getChannelMasks()));
                        } else {
                            map.put(Integer.valueOf(format), new HashSet(Ints.i0(audioProfileA.getChannelMasks())));
                        }
                    }
                }
            }
            ImmutableList.b bVar = ImmutableList.f27874c;
            ImmutableList.a aVar = new ImmutableList.a();
            for (Map.Entry entry : map.entrySet()) {
                aVar.c(new C0512a(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
            }
            return new a(aVar.h());
        }
        if (i10 >= 23) {
            AudioDeviceInfo[] devices = kVar == null ? audioManagerA.getDevices(2) : new AudioDeviceInfo[]{(AudioDeviceInfo) kVar.f27754b};
            ImmutableSet.a aVar2 = new ImmutableSet.a();
            aVar2.d(8, 7);
            if (i10 >= 31) {
                aVar2.d(26, 27);
            }
            if (i10 >= 33) {
                aVar2.c(30);
            }
            ImmutableSet immutableSetH = aVar2.h();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (immutableSetH.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return f45052c;
                }
            }
        }
        ImmutableSet.a aVar3 = new ImmutableSet.a();
        aVar3.c(2);
        int i12 = A.f40996a;
        if (i12 >= 29 && (A.E(context) || (i12 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            ImmutableList.b bVar2 = ImmutableList.f27874c;
            ImmutableList.a aVar4 = new ImmutableList.a();
            ImmutableSet immutableSet = immutableMap.f27879c;
            ImmutableSet immutableSet2 = immutableSet;
            if (immutableSet == null) {
                ImmutableSet immutableSetC = immutableMap.c();
                immutableMap.f27879c = immutableSetC;
                immutableSet2 = immutableSetC;
            }
            C it = immutableSet2.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (A.f40996a >= A.m(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c2198d.a().f35246a)) {
                    aVar4.c(num);
                }
            }
            aVar4.c(2);
            ImmutableList immutableListH = aVar4.h();
            immutableListH.getClass();
            aVar3.f(immutableListH);
            return new a(a(Ints.l0(aVar3.h()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z10) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    ImmutableList<Integer> immutableList = f45053d;
                    immutableList.getClass();
                    aVar3.f(immutableList);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            ImmutableList<Integer> immutableList2 = f45053d;
            immutableList2.getClass();
            aVar3.f(immutableList2);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new a(a(Ints.l0(aVar3.h()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List<Integer> listI0 = Ints.i0(intArrayExtra);
            listI0.getClass();
            aVar3.f(listI0);
        }
        return new a(a(Ints.l0(aVar3.h()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static a c(Context context, C2198d c2198d, k kVar) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c2198d, kVar);
    }

    public final Pair<Integer, Integer> d(n nVar, C2198d c2198d) {
        String str = nVar.f35302n;
        str.getClass();
        int iC = t.c(str, nVar.f35299k);
        ImmutableMap<Integer, Integer> immutableMap = f45054e;
        if (!immutableMap.containsKey(Integer.valueOf(iC))) {
            return null;
        }
        SparseArray<C0512a> sparseArray = this.f45055a;
        if (iC == 18 && !A.i(sparseArray, 18)) {
            iC = 6;
        } else if ((iC == 8 && !A.i(sparseArray, 8)) || (iC == 30 && !A.i(sparseArray, 30))) {
            iC = 7;
        }
        if (!A.i(sparseArray, iC)) {
            return null;
        }
        C0512a c0512a = sparseArray.get(iC);
        c0512a.getClass();
        int i10 = 0;
        zContains = false;
        boolean zContains = false;
        int iIntValue = c0512a.f45059b;
        ImmutableSet<Integer> immutableSet = c0512a.f45060c;
        int i11 = nVar.f35279D;
        if (i11 == -1 || iC == 18) {
            int i12 = nVar.f35280E;
            if (i12 == -1) {
                i12 = 48000;
            }
            if (immutableSet == null) {
                int i13 = A.f40996a;
                int i14 = c0512a.f45058a;
                if (i13 >= 29) {
                    for (int i15 = 10; i15 > 0; i15--) {
                        int iO = A.o(i15);
                        if (iO != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i14).setSampleRate(i12).setChannelMask(iO).build(), c2198d.a().f35246a)) {
                            i10 = i15;
                            break;
                        }
                    }
                    iIntValue = i10;
                } else {
                    Integer num = immutableMap.get(Integer.valueOf(i14));
                    iIntValue = (num != null ? num : 0).intValue();
                }
            }
            i11 = iIntValue;
        } else if (!nVar.f35302n.equals("audio/vnd.dts.uhd;profile=p2") || A.f40996a >= 33) {
            if (immutableSet != null) {
                int iO2 = A.o(i11);
                if (iO2 != 0) {
                    zContains = immutableSet.contains(Integer.valueOf(iO2));
                }
            } else if (i11 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i11 > 10) {
            return null;
        }
        int i16 = A.f40996a;
        if (i16 <= 28) {
            if (i11 == 7) {
                i11 = 8;
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                i11 = 6;
            }
        }
        if (i16 <= 26 && "fugu".equals(Build.DEVICE) && i11 == 1) {
            i11 = 2;
        }
        int iO3 = A.o(i11);
        if (iO3 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iC), Integer.valueOf(iO3));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        SparseArray<C0512a> sparseArray = this.f45055a;
        SparseArray<C0512a> sparseArray2 = aVar.f45055a;
        int i10 = A.f40996a;
        if (sparseArray == null) {
            if (sparseArray2 == null) {
                zContentEquals = true;
            } else {
                zContentEquals = false;
            }
        } else if (sparseArray2 == null) {
            zContentEquals = false;
        } else if (A.f40996a >= 31) {
            zContentEquals = sparseArray.contentEquals(sparseArray2);
        } else {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        if (Objects.equals(sparseArray.valueAt(i11), sparseArray2.get(sparseArray.keyAt(i11)))) {
                            i11++;
                        }
                    } else {
                        zContentEquals = true;
                    }
                }
            }
            zContentEquals = false;
        }
        return zContentEquals && this.f45056b == aVar.f45056b;
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray<C0512a> sparseArray = this.f45055a;
        if (A.f40996a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f45056b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f45056b + ", audioProfiles=" + this.f45055a + "]";
    }

    /* JADX INFO: renamed from: o1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioCapabilities.java */
    public static final class C0512a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0512a f45057d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f45059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImmutableSet<Integer> f45060c;

        static {
            C0512a c0512a;
            if (A.f40996a >= 33) {
                ImmutableSet.a aVar = new ImmutableSet.a();
                for (int i10 = 1; i10 <= 10; i10++) {
                    aVar.c(Integer.valueOf(A.o(i10)));
                }
                c0512a = new C0512a(2, aVar.h());
            } else {
                c0512a = new C0512a(2, 10);
            }
            f45057d = c0512a;
        }

        public C0512a(int i10, Set<Integer> set) {
            this.f45058a = i10;
            ImmutableSet<Integer> immutableSetC = ImmutableSet.C(set);
            this.f45060c = immutableSetC;
            C<Integer> it = immutableSetC.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.f45059b = iMax;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0512a)) {
                return false;
            }
            C0512a c0512a = (C0512a) obj;
            return this.f45058a == c0512a.f45058a && this.f45059b == c0512a.f45059b && Objects.equals(this.f45060c, c0512a.f45060c);
        }

        public final int hashCode() {
            int i10 = ((this.f45058a * 31) + this.f45059b) * 31;
            ImmutableSet<Integer> immutableSet = this.f45060c;
            return i10 + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public final String toString() {
            return "AudioProfile[format=" + this.f45058a + ", maxChannelCount=" + this.f45059b + ", channelMasks=" + this.f45060c + "]";
        }

        public C0512a(int i10, int i11) {
            this.f45058a = i10;
            this.f45059b = i11;
            this.f45060c = null;
        }
    }
}
