/*
 * Copyright 2016 Livotov Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package llabsapptemplatepkg.client.v1.model;

/**
 * (c) Livotov Labs Ltd. 2012
 * Date: 14/08/2016
 */
public class ApiError extends BasicResult
{

    private transient Throwable localException;

    public ApiError()
    {
        super();
    }

    public ApiError(final int code)
    {
        super();
        setError(code);
        setMessage("");
    }

    public ApiError(final int code, final String message)
    {
        super();
        setError(code);
        setMessage(message);
    }

    public ApiError(final int code, final String message, Throwable localException)
    {
        super();
        setError(code);
        setMessage(message);
        this.localException = localException;
    }


    public ApiError(final Throwable localException)
    {
        this.localException = localException;
    }

    public Throwable getLocalException()
    {
        return localException;
    }
}
