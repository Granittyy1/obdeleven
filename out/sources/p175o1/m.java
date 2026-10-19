package p175o1;

import J4.n;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.K;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import p114j1.A;
import p114j1.c;
import p114j1.k;
import p114j1.t;

/* JADX INFO: compiled from: AudioTrackPositionTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f45120A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f45121B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f45122C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f45123D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f45124E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f45125F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f45126G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f45127H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public t f45128I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultAudioSink.i f45129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f45130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f45131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f45133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f45137i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f45138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f45139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Method f45140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f45141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f45144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f45145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f45146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f45147t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f45148u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f45149v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f45150w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f45151x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f45152y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f45153z;

    public m(DefaultAudioSink.i iVar) {
        this.f45129a = iVar;
        try {
            this.f45140m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f45130b = new long[10];
        this.f45128I = c.f41011a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0141  */
    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    /* JADX WARN: Code duplicated, block: B:74:0x0150  */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x016b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x0230 A[Catch: Exception -> 0x0246, TRY_LEAVE, TryCatch #0 {Exception -> 0x0246, blocks: (B:92:0x020a, B:94:0x0230), top: B:145:0x020a }] */
    /* JADX WARN: Code duplicated, block: B:98:0x024b  */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x0230, please report this as an issue */
    public final long a() {
        long jS;
        long jMax;
        final j jVar;
        Handler handler;
        l lVar;
        l.a aVar;
        boolean timestamp;
        long j;
        long j10;
        long J10;
        long j11;
        long j12;
        Method method;
        long jMax2;
        AudioTrack audioTrack = this.f45131c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        DefaultAudioSink.i iVar = this.f45129a;
        if (playState == 3) {
            this.f45128I.getClass();
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.f45139l >= 30000) {
                long J11 = A.J(this.f45134f, b());
                if (J11 == 0) {
                    audioTrack = audioTrack;
                } else {
                    int i10 = this.f45149v;
                    float f10 = this.f45137i;
                    if (f10 != 1.0f) {
                        J11 = Math.round(J11 / ((double) f10));
                    }
                    long[] jArr = this.f45130b;
                    jArr[i10] = J11 - jNanoTime;
                    this.f45149v = (this.f45149v + 1) % 10;
                    int i11 = this.f45150w;
                    if (i11 < 10) {
                        this.f45150w = i11 + 1;
                    }
                    this.f45139l = jNanoTime;
                    this.f45138k = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f45150w;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f45138k = (jArr[i12] / ((long) i13)) + this.f45138k;
                        i12++;
                    }
                    if (this.f45135g) {
                        audioTrack = audioTrack;
                    } else {
                        lVar = this.f45133e;
                        lVar.getClass();
                        aVar = lVar.f45107a;
                        if (aVar != null || jNanoTime - lVar.f45111e < lVar.f45110d) {
                            audioTrack = audioTrack;
                            jNanoTime = jNanoTime;
                        } else {
                            lVar.f45111e = jNanoTime;
                            AudioTrack audioTrack2 = aVar.f45113a;
                            AudioTimestamp audioTimestamp = aVar.f45114b;
                            timestamp = audioTrack2.getTimestamp(audioTimestamp);
                            if (timestamp) {
                                long j13 = audioTimestamp.framePosition;
                                long j14 = aVar.f45116d;
                                if (j14 > j13) {
                                    if (aVar.f45118f) {
                                        aVar.f45119g += j14;
                                        aVar.f45118f = false;
                                    } else {
                                        aVar.f45115c++;
                                    }
                                }
                                aVar.f45116d = j13;
                                aVar.f45117e = j13 + aVar.f45119g + (aVar.f45115c << 32);
                            } else {
                                audioTrack = audioTrack;
                            }
                            int i14 = lVar.f45108b;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 != 2) {
                                        if (i14 != 3) {
                                            if (i14 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (timestamp) {
                                            lVar.a();
                                        }
                                    } else if (!timestamp) {
                                        lVar.a();
                                    }
                                } else if (!timestamp) {
                                    lVar.a();
                                } else if (aVar.f45117e > lVar.f45112f) {
                                    lVar.b(2);
                                }
                            } else if (timestamp) {
                                if (audioTimestamp.nanoTime / 1000 >= lVar.f45109c) {
                                    lVar.f45112f = aVar.f45117e;
                                    lVar.b(1);
                                }
                            } else if (jNanoTime - lVar.f45109c > 500000) {
                                lVar.b(3);
                            }
                            if (timestamp) {
                                if (aVar != null) {
                                    j = aVar.f45114b.nanoTime / 1000;
                                } else {
                                    j = -9223372036854775807L;
                                }
                                if (aVar != null) {
                                    j10 = aVar.f45117e;
                                } else {
                                    j10 = -1;
                                }
                                J10 = A.J(this.f45134f, b());
                                if (Math.abs(j - jNanoTime) > 5000000) {
                                    StringBuilder sbF = n.f("Spurious audio timestamp (system clock mismatch): ", ", ", j10);
                                    sbF.append(j);
                                    sbF.append(", ");
                                    j12 = jNanoTime;
                                    sbF.append(j12);
                                    sbF.append(", ");
                                    sbF.append(J10);
                                    sbF.append(", ");
                                    DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                                    sbF.append(defaultAudioSink.j());
                                    sbF.append(", ");
                                    sbF.append(defaultAudioSink.k());
                                    k.f(sbF.toString());
                                    lVar.b(4);
                                } else {
                                    j11 = jNanoTime;
                                    if (Math.abs(A.J(this.f45134f, j10) - J10) > 5000000) {
                                        StringBuilder sbF2 = n.f("Spurious audio timestamp (frame position mismatch): ", ", ", j10);
                                        sbF2.append(j);
                                        sbF2.append(", ");
                                        j12 = j11;
                                        sbF2.append(j12);
                                        sbF2.append(", ");
                                        sbF2.append(J10);
                                        sbF2.append(", ");
                                        DefaultAudioSink defaultAudioSink2 = DefaultAudioSink.this;
                                        sbF2.append(defaultAudioSink2.j());
                                        sbF2.append(", ");
                                        sbF2.append(defaultAudioSink2.k());
                                        k.f(sbF2.toString());
                                        lVar.b(4);
                                    } else {
                                        j12 = j11;
                                        if (lVar.f45108b == 4) {
                                            lVar.a();
                                        }
                                    }
                                }
                            } else {
                                j12 = jNanoTime;
                            }
                            if (this.f45143p && (method = this.f45140m) != null && j12 - this.f45144q >= 500000) {
                                try {
                                    AudioTrack audioTrack3 = this.f45131c;
                                    audioTrack3.getClass();
                                    Integer num = (Integer) method.invoke(audioTrack3, null);
                                    int i15 = A.f40996a;
                                    long jIntValue = (((long) num.intValue()) * 1000) - this.f45136h;
                                    this.f45141n = jIntValue;
                                    jMax2 = Math.max(jIntValue, 0L);
                                    this.f45141n = jMax2;
                                    if (jMax2 > 5000000) {
                                        k.f("Ignoring impossibly large audio latency: " + jMax2);
                                        this.f45141n = 0L;
                                    }
                                } catch (Exception unused) {
                                    this.f45140m = null;
                                }
                                this.f45144q = j12;
                            }
                        }
                        timestamp = false;
                        if (timestamp) {
                            j12 = jNanoTime;
                        } else {
                            if (aVar != null) {
                                j = aVar.f45114b.nanoTime / 1000;
                            } else {
                                j = -9223372036854775807L;
                            }
                            if (aVar != null) {
                                j10 = aVar.f45117e;
                            } else {
                                j10 = -1;
                            }
                            J10 = A.J(this.f45134f, b());
                            if (Math.abs(j - jNanoTime) > 5000000) {
                                StringBuilder sbF3 = n.f("Spurious audio timestamp (system clock mismatch): ", ", ", j10);
                                sbF3.append(j);
                                sbF3.append(", ");
                                j12 = jNanoTime;
                                sbF3.append(j12);
                                sbF3.append(", ");
                                sbF3.append(J10);
                                sbF3.append(", ");
                                DefaultAudioSink defaultAudioSink3 = DefaultAudioSink.this;
                                sbF3.append(defaultAudioSink3.j());
                                sbF3.append(", ");
                                sbF3.append(defaultAudioSink3.k());
                                k.f(sbF3.toString());
                                lVar.b(4);
                            } else {
                                j11 = jNanoTime;
                                if (Math.abs(A.J(this.f45134f, j10) - J10) > 5000000) {
                                    StringBuilder sbF4 = n.f("Spurious audio timestamp (frame position mismatch): ", ", ", j10);
                                    sbF4.append(j);
                                    sbF4.append(", ");
                                    j12 = j11;
                                    sbF4.append(j12);
                                    sbF4.append(", ");
                                    sbF4.append(J10);
                                    sbF4.append(", ");
                                    DefaultAudioSink defaultAudioSink4 = DefaultAudioSink.this;
                                    sbF4.append(defaultAudioSink4.j());
                                    sbF4.append(", ");
                                    sbF4.append(defaultAudioSink4.k());
                                    k.f(sbF4.toString());
                                    lVar.b(4);
                                } else {
                                    j12 = j11;
                                    if (lVar.f45108b == 4) {
                                        lVar.a();
                                    }
                                }
                            }
                        }
                        if (this.f45143p) {
                            AudioTrack audioTrack4 = this.f45131c;
                            audioTrack4.getClass();
                            Integer num2 = (Integer) method.invoke(audioTrack4, null);
                            int i16 = A.f40996a;
                            long jIntValue2 = (((long) num2.intValue()) * 1000) - this.f45136h;
                            this.f45141n = jIntValue2;
                            jMax2 = Math.max(jIntValue2, 0L);
                            this.f45141n = jMax2;
                            if (jMax2 > 5000000) {
                                k.f("Ignoring impossibly large audio latency: " + jMax2);
                                this.f45141n = 0L;
                            }
                            this.f45144q = j12;
                        }
                    }
                }
            } else if (this.f45135g) {
                audioTrack = audioTrack;
            } else {
                lVar = this.f45133e;
                lVar.getClass();
                aVar = lVar.f45107a;
                if (aVar != null) {
                    audioTrack = audioTrack;
                    jNanoTime = jNanoTime;
                    timestamp = false;
                } else {
                    audioTrack = audioTrack;
                    jNanoTime = jNanoTime;
                    timestamp = false;
                }
                if (timestamp) {
                    j12 = jNanoTime;
                } else {
                    if (aVar != null) {
                        j = aVar.f45114b.nanoTime / 1000;
                    } else {
                        j = -9223372036854775807L;
                    }
                    if (aVar != null) {
                        j10 = aVar.f45117e;
                    } else {
                        j10 = -1;
                    }
                    J10 = A.J(this.f45134f, b());
                    if (Math.abs(j - jNanoTime) > 5000000) {
                        StringBuilder sbF5 = n.f("Spurious audio timestamp (system clock mismatch): ", ", ", j10);
                        sbF5.append(j);
                        sbF5.append(", ");
                        j12 = jNanoTime;
                        sbF5.append(j12);
                        sbF5.append(", ");
                        sbF5.append(J10);
                        sbF5.append(", ");
                        DefaultAudioSink defaultAudioSink5 = DefaultAudioSink.this;
                        sbF5.append(defaultAudioSink5.j());
                        sbF5.append(", ");
                        sbF5.append(defaultAudioSink5.k());
                        k.f(sbF5.toString());
                        lVar.b(4);
                    } else {
                        j11 = jNanoTime;
                        if (Math.abs(A.J(this.f45134f, j10) - J10) > 5000000) {
                            StringBuilder sbF6 = n.f("Spurious audio timestamp (frame position mismatch): ", ", ", j10);
                            sbF6.append(j);
                            sbF6.append(", ");
                            j12 = j11;
                            sbF6.append(j12);
                            sbF6.append(", ");
                            sbF6.append(J10);
                            sbF6.append(", ");
                            DefaultAudioSink defaultAudioSink6 = DefaultAudioSink.this;
                            sbF6.append(defaultAudioSink6.j());
                            sbF6.append(", ");
                            sbF6.append(defaultAudioSink6.k());
                            k.f(sbF6.toString());
                            lVar.b(4);
                        } else {
                            j12 = j11;
                            if (lVar.f45108b == 4) {
                                lVar.a();
                            }
                        }
                    }
                }
                if (this.f45143p) {
                    AudioTrack audioTrack5 = this.f45131c;
                    audioTrack5.getClass();
                    Integer num3 = (Integer) method.invoke(audioTrack5, null);
                    int i17 = A.f40996a;
                    long jIntValue3 = (((long) num3.intValue()) * 1000) - this.f45136h;
                    this.f45141n = jIntValue3;
                    jMax2 = Math.max(jIntValue3, 0L);
                    this.f45141n = jMax2;
                    if (jMax2 > 5000000) {
                        k.f("Ignoring impossibly large audio latency: " + jMax2);
                        this.f45141n = 0L;
                    }
                    this.f45144q = j12;
                }
            }
        } else {
            audioTrack = audioTrack;
        }
        this.f45128I.getClass();
        long jNanoTime2 = System.nanoTime() / 1000;
        l lVar2 = this.f45133e;
        lVar2.getClass();
        boolean z10 = lVar2.f45108b == 2;
        if (z10) {
            l.a aVar2 = lVar2.f45107a;
            jMax = A.s(this.f45137i, jNanoTime2 - (aVar2 != null ? aVar2.f45114b.nanoTime / 1000 : -9223372036854775807L)) + A.J(this.f45134f, aVar2 != null ? aVar2.f45117e : -1L);
        } else {
            if (this.f45150w == 0) {
                jS = this.f45151x != -9223372036854775807L ? A.J(this.f45134f, c()) : A.J(this.f45134f, b());
            } else {
                jS = A.s(this.f45137i, this.f45138k + jNanoTime2);
            }
            jMax = Math.max(0L, jS - this.f45141n);
            if (this.f45151x != -9223372036854775807L) {
                jMax = Math.min(A.J(this.f45134f, this.f45120A), jMax);
            }
        }
        if (this.f45123D != z10) {
            this.f45125F = this.f45122C;
            this.f45124E = this.f45121B;
        }
        long j15 = jNanoTime2 - this.f45125F;
        if (j15 < 1000000) {
            long jS2 = A.s(this.f45137i, j15) + this.f45124E;
            long j16 = (j15 * 1000) / 1000000;
            jMax = (((1000 - j16) * jS2) + (jMax * j16)) / 1000;
        }
        if (!this.j && jMax > this.f45121B && audioTrack.getPlayState() == 3) {
            this.j = true;
            long jQ = A.Q(jMax - this.f45121B);
            float f11 = this.f45137i;
            if (f11 != 1.0f) {
                jQ = Math.round(jQ / ((double) f11));
            }
            this.f45128I.getClass();
            final long jCurrentTimeMillis = System.currentTimeMillis() - A.Q(jQ);
            androidx.media3.exoplayer.audio.c.a aVar3 = DefaultAudioSink.this.f18251r;
            if (aVar3 != null && (handler = (jVar = androidx.media3.exoplayer.audio.c.this.f18299T0).f45099a) != null) {
                handler.post(new Runnable() { // from class: o1.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        j jVar2 = jVar;
                        jVar2.getClass();
                        int i18 = A.f40996a;
                        K.this.f18039s.R(jCurrentTimeMillis);
                    }
                });
            }
        }
        this.f45122C = jNanoTime2;
        this.f45121B = jMax;
        this.f45123D = z10;
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    public final long b() {
        long j;
        if (this.f45151x != -9223372036854775807L) {
            return Math.min(this.f45120A, c());
        }
        this.f45128I.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f45145r >= 5) {
            AudioTrack audioTrack = this.f45131c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f45135g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f45148u = this.f45146s;
                    }
                    playbackHeadPosition += this.f45148u;
                }
                if (A.f40996a > 29) {
                    j = this.f45146s;
                    if (j > playbackHeadPosition) {
                        if (this.f45126G) {
                            this.f45127H += j;
                            this.f45126G = false;
                        } else {
                            this.f45147t++;
                        }
                    }
                    this.f45146s = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f45146s <= 0 || playState != 3) {
                    this.f45152y = -9223372036854775807L;
                    j = this.f45146s;
                    if (j > playbackHeadPosition) {
                        if (this.f45126G) {
                            this.f45127H += j;
                            this.f45126G = false;
                        } else {
                            this.f45147t++;
                        }
                    }
                    this.f45146s = playbackHeadPosition;
                } else if (this.f45152y == -9223372036854775807L) {
                    this.f45152y = jElapsedRealtime;
                }
            }
            this.f45145r = jElapsedRealtime;
        }
        return this.f45146s + this.f45127H + (this.f45147t << 32);
    }

    public final long c() {
        AudioTrack audioTrack = this.f45131c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f45153z;
        }
        this.f45128I.getClass();
        return this.f45153z + A.L(A.s(this.f45137i, A.F(SystemClock.elapsedRealtime()) - this.f45151x), this.f45134f, 1000000L, RoundingMode.UP);
    }

    public final boolean d(long j) {
        long jA = a();
        int i10 = this.f45134f;
        int i11 = A.f40996a;
        if (j <= A.L(jA, i10, 1000000L, RoundingMode.UP)) {
            if (this.f45135g) {
                AudioTrack audioTrack = this.f45131c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || b() != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e() {
        this.f45138k = 0L;
        this.f45150w = 0;
        this.f45149v = 0;
        this.f45139l = 0L;
        this.f45122C = 0L;
        this.f45125F = 0L;
        this.j = false;
    }
}
