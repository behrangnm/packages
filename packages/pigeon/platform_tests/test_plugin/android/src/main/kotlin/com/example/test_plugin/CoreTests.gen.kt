// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
// 
// Autogenerated from Pigeon (v5.0.1), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.example.test_plugin

import android.util.Log
import io.flutter.plugin.common.BasicMessageChannel
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MessageCodec
import io.flutter.plugin.common.StandardMessageCodec
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer

/** Generated class from Pigeon. */

enum class AnEnum(val raw: Int) {
  ONE(0),
  TWO(1),
  THREE(2);

  companion object {
    fun ofRaw(raw: Int): AnEnum? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class AllTypes (
  val aBool: Boolean,
  val anInt: Long,
  val aDouble: Double,
  val aString: String,
  val aByteArray: ByteArray,
  val a4ByteArray: IntArray,
  val a8ByteArray: LongArray,
  val aFloatArray: DoubleArray,
  val aList: List<Any?>,
  val aMap: Map<Any, Any?>,
  val anEnum: AnEnum

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): AllTypes {
      val aBool = list[0] as Boolean
      val anInt = list[1] as Long
      val aDouble = list[2] as Double
      val aString = list[3] as String
      val aByteArray = list[4] as ByteArray
      val a4ByteArray = list[5] as IntArray
      val a8ByteArray = list[6] as LongArray
      val aFloatArray = list[7] as DoubleArray
      val aList = list[8] as List<Any?>
      val aMap = list[9] as Map<Any, Any?>
      val anEnum = AnEnum.ofRaw(list[10] as Int)!!
      return AllTypes(aBool, anInt, aDouble, aString, aByteArray, a4ByteArray, a8ByteArray, aFloatArray, aList, aMap, anEnum)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      aBool,
      anInt,
      aDouble,
      aString,
      aByteArray,
      a4ByteArray,
      a8ByteArray,
      aFloatArray,
      aList,
      aMap,
      anEnum?.raw,
    )
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class AllNullableTypes (
  val aNullableBool: Boolean? = null,
  val aNullableInt: Long? = null,
  val aNullableDouble: Double? = null,
  val aNullableString: String? = null,
  val aNullableByteArray: ByteArray? = null,
  val aNullable4ByteArray: IntArray? = null,
  val aNullable8ByteArray: LongArray? = null,
  val aNullableFloatArray: DoubleArray? = null,
  val aNullableList: List<Any?>? = null,
  val aNullableMap: Map<Any, Any?>? = null,
  val nullableNestedList: List<List<Boolean?>?>? = null,
  val nullableMapWithAnnotations: Map<String?, String?>? = null,
  val nullableMapWithObject: Map<String?, Any?>? = null,
  val aNullableEnum: AnEnum? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): AllNullableTypes {
      val aNullableBool = list[0] as? Boolean
      val aNullableInt = list[1].let { if (it is Int) it.toLong() else it as? Long }
      val aNullableDouble = list[2] as? Double
      val aNullableString = list[3] as? String
      val aNullableByteArray = list[4] as? ByteArray
      val aNullable4ByteArray = list[5] as? IntArray
      val aNullable8ByteArray = list[6] as? LongArray
      val aNullableFloatArray = list[7] as? DoubleArray
      val aNullableList = list[8] as? List<Any?>
      val aNullableMap = list[9] as? Map<Any, Any?>
      val nullableNestedList = list[10] as? List<List<Boolean?>?>
      val nullableMapWithAnnotations = list[11] as? Map<String?, String?>
      val nullableMapWithObject = list[12] as? Map<String?, Any?>
      val aNullableEnum: AnEnum? = (list[13] as? Int)?.let {
        AnEnum.ofRaw(it)
      }

      return AllNullableTypes(aNullableBool, aNullableInt, aNullableDouble, aNullableString, aNullableByteArray, aNullable4ByteArray, aNullable8ByteArray, aNullableFloatArray, aNullableList, aNullableMap, nullableNestedList, nullableMapWithAnnotations, nullableMapWithObject, aNullableEnum)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      aNullableBool,
      aNullableInt,
      aNullableDouble,
      aNullableString,
      aNullableByteArray,
      aNullable4ByteArray,
      aNullable8ByteArray,
      aNullableFloatArray,
      aNullableList,
      aNullableMap,
      nullableNestedList,
      nullableMapWithAnnotations,
      nullableMapWithObject,
      aNullableEnum?.raw,
    )
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class AllNullableTypesWrapper (
  val values: AllNullableTypes

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): AllNullableTypesWrapper {
      val values = AllNullableTypes.fromList(list[0] as List<Any?>)

      return AllNullableTypesWrapper(values)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      values?.toList(),
    )
  }
}

@Suppress("UNCHECKED_CAST")
private object HostIntegrationCoreApiCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      128.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          AllNullableTypes.fromList(it)
        }
      }
      129.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          AllNullableTypesWrapper.fromList(it)
        }
      }
      130.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          AllTypes.fromList(it)
        }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }
  override fun writeValue(stream: ByteArrayOutputStream, value: Any?)   {
    when (value) {
      is AllNullableTypes -> {
        stream.write(128)
        writeValue(stream, value.toList())
      }
      is AllNullableTypesWrapper -> {
        stream.write(129)
        writeValue(stream, value.toList())
      }
      is AllTypes -> {
        stream.write(130)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

/**
 * The core interface that each host language plugin must implement in
 * platform_test integration tests.
 *
 * Generated interface from Pigeon that represents a handler of messages from Flutter.
 */
interface HostIntegrationCoreApi {
  /**
   * A no-op function taking no arguments and returning no value, to sanity
   * test basic calling.
   */
  fun noop()
  /** Returns the passed object, to test serialization and deserialization. */
  fun echoAllTypes(everything: AllTypes): AllTypes
  /** Returns the passed object, to test serialization and deserialization. */
  fun echoAllNullableTypes(everything: AllNullableTypes?): AllNullableTypes?
  /** Returns an error, to test error handling. */
  fun throwError()
  /** Returns passed in int. */
  fun echoInt(anInt: Long): Long
  /** Returns passed in double. */
  fun echoDouble(aDouble: Double): Double
  /** Returns the passed in boolean. */
  fun echoBool(aBool: Boolean): Boolean
  /** Returns the passed in string. */
  fun echoString(aString: String): String
  /** Returns the passed in Uint8List. */
  fun echoUint8List(aUint8List: ByteArray): ByteArray
  /** Returns the passed in generic Object. */
  fun echoObject(anObject: Any): Any
  /**
   * Returns the inner `aString` value from the wrapped object, to test
   * sending of nested objects.
   */
  fun extractNestedNullableString(wrapper: AllNullableTypesWrapper): String?
  /**
   * Returns the inner `aString` value from the wrapped object, to test
   * sending of nested objects.
   */
  fun createNestedNullableString(nullableString: String?): AllNullableTypesWrapper
  /** Returns passed in arguments of multiple types. */
  fun sendMultipleNullableTypes(aNullableBool: Boolean?, aNullableInt: Long?, aNullableString: String?): AllNullableTypes
  /** Returns passed in int. */
  fun echoNullableInt(aNullableInt: Long?): Long?
  /** Returns passed in double. */
  fun echoNullableDouble(aNullableDouble: Double?): Double?
  /** Returns the passed in boolean. */
  fun echoNullableBool(aNullableBool: Boolean?): Boolean?
  /** Returns the passed in string. */
  fun echoNullableString(aNullableString: String?): String?
  /** Returns the passed in Uint8List. */
  fun echoNullableUint8List(aNullableUint8List: ByteArray?): ByteArray?
  /** Returns the passed in generic Object. */
  fun echoNullableObject(aNullableObject: Any?): Any?
  /**
   * A no-op function taking no arguments and returning no value, to sanity
   * test basic asynchronous calling.
   */
  fun noopAsync(callback: () -> Unit)
  /** Returns the passed string asynchronously. */
  fun echoAsyncString(aString: String, callback: (String) -> Unit)
  fun callFlutterNoop(callback: () -> Unit)
  fun callFlutterEchoString(aString: String, callback: (String) -> Unit)

  companion object {
    /** The codec used by HostIntegrationCoreApi. */
    val codec: MessageCodec<Any?> by lazy {
      HostIntegrationCoreApiCodec
    }
    /** Sets up an instance of `HostIntegrationCoreApi` to handle messages through the `binaryMessenger`. */
    @Suppress("UNCHECKED_CAST")
    fun setUp(binaryMessenger: BinaryMessenger, api: HostIntegrationCoreApi?) {
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.noop", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            var wrapped = listOf<Any?>()
            try {
              api.noop()
              wrapped = listOf<Any?>(null)
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoAllTypes", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val everythingArg = args[0] as AllTypes
              wrapped = listOf<Any?>(api.echoAllTypes(everythingArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoAllNullableTypes", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val everythingArg = args[0] as? AllNullableTypes
              wrapped = listOf<Any?>(api.echoAllNullableTypes(everythingArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.throwError", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            var wrapped = listOf<Any?>()
            try {
              api.throwError()
              wrapped = listOf<Any?>(null)
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoInt", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val anIntArg = args[0].let { if (it is Int) it.toLong() else it as Long }
              wrapped = listOf<Any?>(api.echoInt(anIntArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoDouble", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aDoubleArg = args[0] as Double
              wrapped = listOf<Any?>(api.echoDouble(aDoubleArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoBool", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aBoolArg = args[0] as Boolean
              wrapped = listOf<Any?>(api.echoBool(aBoolArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoString", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aStringArg = args[0] as String
              wrapped = listOf<Any?>(api.echoString(aStringArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoUint8List", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aUint8ListArg = args[0] as ByteArray
              wrapped = listOf<Any?>(api.echoUint8List(aUint8ListArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoObject", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val anObjectArg = args[0] as Any
              wrapped = listOf<Any?>(api.echoObject(anObjectArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.extractNestedNullableString", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val wrapperArg = args[0] as AllNullableTypesWrapper
              wrapped = listOf<Any?>(api.extractNestedNullableString(wrapperArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.createNestedNullableString", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val nullableStringArg = args[0] as? String
              wrapped = listOf<Any?>(api.createNestedNullableString(nullableStringArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.sendMultipleNullableTypes", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aNullableBoolArg = args[0] as? Boolean
              val aNullableIntArg = args[1].let { if (it is Int) it.toLong() else it as? Long }
              val aNullableStringArg = args[2] as? String
              wrapped = listOf<Any?>(api.sendMultipleNullableTypes(aNullableBoolArg, aNullableIntArg, aNullableStringArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoNullableInt", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aNullableIntArg = args[0].let { if (it is Int) it.toLong() else it as? Long }
              wrapped = listOf<Any?>(api.echoNullableInt(aNullableIntArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoNullableDouble", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aNullableDoubleArg = args[0] as? Double
              wrapped = listOf<Any?>(api.echoNullableDouble(aNullableDoubleArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoNullableBool", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aNullableBoolArg = args[0] as? Boolean
              wrapped = listOf<Any?>(api.echoNullableBool(aNullableBoolArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoNullableString", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aNullableStringArg = args[0] as? String
              wrapped = listOf<Any?>(api.echoNullableString(aNullableStringArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoNullableUint8List", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aNullableUint8ListArg = args[0] as? ByteArray
              wrapped = listOf<Any?>(api.echoNullableUint8List(aNullableUint8ListArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoNullableObject", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aNullableObjectArg = args[0] as? Any
              wrapped = listOf<Any?>(api.echoNullableObject(aNullableObjectArg))
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.noopAsync", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            var wrapped = listOf<Any?>()
            try {
              api.noopAsync() {
                reply.reply(wrapResult(null))
              }
            } catch (exception: Error) {
              wrapped = wrapError(exception)
              reply.reply(wrapped)
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.echoAsyncString", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aStringArg = args[0] as String
              api.echoAsyncString(aStringArg) {
                reply.reply(wrapResult(it))
              }
            } catch (exception: Error) {
              wrapped = wrapError(exception)
              reply.reply(wrapped)
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.callFlutterNoop", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            var wrapped = listOf<Any?>()
            try {
              api.callFlutterNoop() {
                reply.reply(wrapResult(null))
              }
            } catch (exception: Error) {
              wrapped = wrapError(exception)
              reply.reply(wrapped)
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostIntegrationCoreApi.callFlutterEchoString", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            var wrapped = listOf<Any?>()
            try {
              val args = message as List<Any?>
              val aStringArg = args[0] as String
              api.callFlutterEchoString(aStringArg) {
                reply.reply(wrapResult(it))
              }
            } catch (exception: Error) {
              wrapped = wrapError(exception)
              reply.reply(wrapped)
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
    }
  }
}
@Suppress("UNCHECKED_CAST")
private object FlutterIntegrationCoreApiCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      128.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          AllNullableTypes.fromList(it)
        }
      }
      129.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          AllNullableTypesWrapper.fromList(it)
        }
      }
      130.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          AllTypes.fromList(it)
        }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }
  override fun writeValue(stream: ByteArrayOutputStream, value: Any?)   {
    when (value) {
      is AllNullableTypes -> {
        stream.write(128)
        writeValue(stream, value.toList())
      }
      is AllNullableTypesWrapper -> {
        stream.write(129)
        writeValue(stream, value.toList())
      }
      is AllTypes -> {
        stream.write(130)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

/**
 * The core interface that the Dart platform_test code implements for host
 * integration tests to call into.
 *
 * Generated class from Pigeon that represents Flutter messages that can be called from Kotlin.
 */
@Suppress("UNCHECKED_CAST")
class FlutterIntegrationCoreApi(private val binaryMessenger: BinaryMessenger) {
  companion object {
    /** The codec used by FlutterIntegrationCoreApi. */
    val codec: MessageCodec<Any?> by lazy {
      FlutterIntegrationCoreApiCodec
    }
  }
  /**
   * A no-op function taking no arguments and returning no value, to sanity
   * test basic calling.
   */
  fun noop(callback: () -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.noop", codec)
    channel.send(null) {
      callback()
    }
  }
  /** Returns the passed object, to test serialization and deserialization. */
  fun echoAllTypes(everythingArg: AllTypes, callback: (AllTypes) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoAllTypes", codec)
    channel.send(listOf(everythingArg)) {
      val result = it as AllTypes
      callback(result)
    }
  }
  /** Returns the passed object, to test serialization and deserialization. */
  fun echoAllNullableTypes(everythingArg: AllNullableTypes, callback: (AllNullableTypes) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoAllNullableTypes", codec)
    channel.send(listOf(everythingArg)) {
      val result = it as AllNullableTypes
      callback(result)
    }
  }
  /**
   * Returns passed in arguments of multiple types.
   *
   * Tests multiple-arity FlutterApi handling.
   */
  fun sendMultipleNullableTypes(aNullableBoolArg: Boolean?, aNullableIntArg: Long?, aNullableStringArg: String?, callback: (AllNullableTypes) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.sendMultipleNullableTypes", codec)
    channel.send(listOf(aNullableBoolArg, aNullableIntArg, aNullableStringArg)) {
      val result = it as AllNullableTypes
      callback(result)
    }
  }
  /** Returns the passed boolean, to test serialization and deserialization. */
  fun echoBool(aBoolArg: Boolean, callback: (Boolean) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoBool", codec)
    channel.send(listOf(aBoolArg)) {
      val result = it as Boolean
      callback(result)
    }
  }
  /** Returns the passed int, to test serialization and deserialization. */
  fun echoInt(anIntArg: Long, callback: (Long) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoInt", codec)
    channel.send(listOf(anIntArg)) {
      val result = it as Long
      callback(result)
    }
  }
  /** Returns the passed double, to test serialization and deserialization. */
  fun echoDouble(aDoubleArg: Double, callback: (Double) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoDouble", codec)
    channel.send(listOf(aDoubleArg)) {
      val result = it as Double
      callback(result)
    }
  }
  /** Returns the passed string, to test serialization and deserialization. */
  fun echoString(aStringArg: String, callback: (String) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoString", codec)
    channel.send(listOf(aStringArg)) {
      val result = it as String
      callback(result)
    }
  }
  /** Returns the passed byte list, to test serialization and deserialization. */
  fun echoUint8List(aListArg: ByteArray, callback: (ByteArray) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoUint8List", codec)
    channel.send(listOf(aListArg)) {
      val result = it as ByteArray
      callback(result)
    }
  }
  /** Returns the passed list, to test serialization and deserialization. */
  fun echoList(aListArg: List<Any?>, callback: (List<Any?>) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoList", codec)
    channel.send(listOf(aListArg)) {
      val result = it as List<Any?>
      callback(result)
    }
  }
  /** Returns the passed map, to test serialization and deserialization. */
  fun echoMap(aMapArg: Map<Any?, Any?>, callback: (Map<Any?, Any?>) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoMap", codec)
    channel.send(listOf(aMapArg)) {
      val result = it as Map<Any?, Any?>
      callback(result)
    }
  }
  /** Returns the passed boolean, to test serialization and deserialization. */
  fun echoNullableBool(aBoolArg: Boolean?, callback: (Boolean?) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoNullableBool", codec)
    channel.send(listOf(aBoolArg)) {
      val result = it as? Boolean?
      callback(result)
    }
  }
  /** Returns the passed int, to test serialization and deserialization. */
  fun echoNullableInt(anIntArg: Long?, callback: (Long?) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoNullableInt", codec)
    channel.send(listOf(anIntArg)) {
      val result = it as? Long?
      callback(result)
    }
  }
  /** Returns the passed double, to test serialization and deserialization. */
  fun echoNullableDouble(aDoubleArg: Double?, callback: (Double?) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoNullableDouble", codec)
    channel.send(listOf(aDoubleArg)) {
      val result = it as? Double?
      callback(result)
    }
  }
  /** Returns the passed string, to test serialization and deserialization. */
  fun echoNullableString(aStringArg: String?, callback: (String?) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoNullableString", codec)
    channel.send(listOf(aStringArg)) {
      val result = it as? String?
      callback(result)
    }
  }
  /** Returns the passed byte list, to test serialization and deserialization. */
  fun echoNullableUint8List(aListArg: ByteArray?, callback: (ByteArray?) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoNullableUint8List", codec)
    channel.send(listOf(aListArg)) {
      val result = it as? ByteArray?
      callback(result)
    }
  }
  /** Returns the passed list, to test serialization and deserialization. */
  fun echoNullableList(aListArg: List<Any?>?, callback: (List<Any?>?) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoNullableList", codec)
    channel.send(listOf(aListArg)) {
      val result = it as? List<Any?>?
      callback(result)
    }
  }
  /** Returns the passed map, to test serialization and deserialization. */
  fun echoNullableMap(aMapArg: Map<Any?, Any?>, callback: (Map<Any?, Any?>) -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.FlutterIntegrationCoreApi.echoNullableMap", codec)
    channel.send(listOf(aMapArg)) {
      val result = it as Map<Any?, Any?>
      callback(result)
    }
  }
}
/**
 * An API that can be implemented for minimal, compile-only tests.
 *
 * Generated interface from Pigeon that represents a handler of messages from Flutter.
 */
interface HostTrivialApi {
  fun noop()

  companion object {
    /** The codec used by HostTrivialApi. */
    val codec: MessageCodec<Any?> by lazy {
      StandardMessageCodec()
    }
    /** Sets up an instance of `HostTrivialApi` to handle messages through the `binaryMessenger`. */
    @Suppress("UNCHECKED_CAST")
    fun setUp(binaryMessenger: BinaryMessenger, api: HostTrivialApi?) {
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.HostTrivialApi.noop", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            var wrapped = listOf<Any?>()
            try {
              api.noop()
              wrapped = listOf<Any?>(null)
            } catch (exception: Error) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
    }
  }
}

private fun wrapResult(result: Any?): List<Any?> {
  return listOf(result)
}

private fun wrapError(exception: Throwable): List<Any> {
  return listOf<Any>(
    exception.javaClass.simpleName,
    exception.toString(),
    "Cause: " + exception.cause + ", Stacktrace: " + Log.getStackTraceString(exception)
  )
}
