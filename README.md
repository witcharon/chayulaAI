# ChayulaAI

ChayulaAI is an advanced artificial intelligence assistant plugin for your Minecraft server. It provides intelligent and contextual responses to players using the OpenRouter API.

## ❤️ Planned Features
- Custom URL and API support
- Discord link
- Web chat for your store/forum/blog

## 🌟 Özellikler

- 💬 Advanced AI chat system
- 🌍 Çoklu dil desteği
- 💾 Konuşma geçmişi ve günlük kayıt sistemi
- 🔒 Rate limiting ve güvenlik kontrolleri
- 🎨 Minecraft renk kodları desteği
- 📝 PlaceholderAPI entegrasyonu
- ⚡ Folia, Paper and Spigot desteği

## 🧠 Knowledge Base

- You can redirect the output of the assistant by adding the server's properties to the Knowledge Base.

## ⚠️ Dependencies

- PlaceholderAPI

## 📋 Requirements

- Java 21 or above
- Minecraft 1.20.5 or later
- PlaceholderAPI
- OpenRouter API key

## 🚀 Setup

1. Install the plugin in your server's `plugins` folder
2. Restart the server
3. Edit `plugins/ChayulaAI/config.yml` file
4. Add your OpenRouter API key
5. Restart the server

## 👨🏻‍💼 AI Models

Tested model is "google/gemini-2.0-flash-thinking-exp:free", you can use it for Free by entering your API key. You can also use other free or paid models, but don't forget to test the outputs by asking questions.

## ⚠️ Important

Even if you define a default language for the output, if the player says "answer me in German", the AI model will respond in German. In short, you can support players in all languages with a single knowledge base.

## 🛠️ Commands

- `/ai <message>` - Chat with the AI
- `/cai reload` - Reload configuration
- `/cai status` - Show plugin status
- `/cai test` - Test API connection

## 🔐 Permissions

- `cai.use` - Permission to use AI chat
- `cai.admin` - Permission to use admin commands

## 📝 Custom Language Support

1. Create a new language file in `plugins/ChayulaAI/messages`
2. Use existing language files as templates
3. Update the `language` setting in config

## 🤝 Contributing

1. Fork this repository
2. Create a new branch (`git checkout -b feature/amazing`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature/amazing`)
5. Create a Pull Request

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🐛 Bug Reporting

If you find a bug or have a suggestion, please report it through GitHub Issues.

## ✨ Contributors

- [Chayula](https://github.com/witcharon) - Main developer