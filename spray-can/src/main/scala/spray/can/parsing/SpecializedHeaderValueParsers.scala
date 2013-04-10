/*
 * Copyright (C) 2011-2013 spray.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package spray.can.parsing

import spray.http.{ HttpHeader, ErrorInfo }

trait SpecializedHeaderValueParsers { _: HttpHeaderParser.type ⇒

  def specializedHeaderValueParsers = Seq(
    SpecialContentLengthParser)

  object SpecialContentLengthParser extends HeaderValueParser {
    def lowercaseName: String = ???
    def apply(input: CharSequence, startIx: Int, warnOnIllegalHeader: (ErrorInfo) ⇒ Unit): (HttpHeader, Int) = ???
  }

}